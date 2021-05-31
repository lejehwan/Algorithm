package baekjoon동적계획법1;

import java.util.Scanner;

// 시작 인덱스를 0으로 잡고 풀면 step2에서 인덱스 오류가 나기 때문에
// -> 시작 인덱스를 1로 잡고 풀어야 함
// bottom-up
public class 계단오르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stair = new int[n + 1];
		int[] dp = new int[n + 1];
		for (int i = 1; i < stair.length; i++) {
			stair[i] = sc.nextInt();
		}
		dp[1] = stair[1];
		// n >= 2의 조건을 넣지 않을 경우 ArrayIndexOutOfBounds 에러남 
		if (n >= 2) {
			dp[2] = dp[1] + stair[2];
		}
		for (int i = 3; i < dp.length; i++) {
			int step1 = dp[i - 2] + stair[i];// 현재 위치에서 2칸 뛸 때
			int step2 = dp[i - 3] + stair[i - 1] + stair[i];// 현재 위치에서 1칸 뛰고 2칸 뛸 때
			dp[i] = Math.max(step1, step2);
		}
		System.out.println(dp[n]);
		sc.close();
	}
}

//top-down
//public class 계단오르기 {
//	static Integer[] dp;
//	static int[] stair;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		stair = new int[n+1];
//		dp = new Integer[n+1];
//		for (int i = 1; i < stair.length; i++) {
//			stair[i] = sc.nextInt();
//		}
//		dp[0] = stair[0];
//		dp[1] = stair[1];
//		if (n >= 2) {
//			dp[2] = dp[1] + stair[2];
//		}
//		
//		System.out.println(find(n));
//		sc.close();
//	}
//	static int find(int n) {
//		if (dp[n] == null) {
//			dp[n] = Math.max(find(n-2), stair[n-1] + find(n-3)) + stair[n];
//		}
//		return dp[n];
//	}
//}