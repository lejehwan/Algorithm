package baekjoon동적계획법1;

import java.util.Scanner;

// bottom-up
public class 타일01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[n + 1];
		dp[0] = 1;
		dp[1] = 2;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
		}
		System.out.println(dp[n - 1]);
		sc.close();
	}
}

//// top-down
//class 타일01{
//	static long[] dp = new long[1000001];

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		dp[0] = 1;
//		dp[1] = 2;
//		tile(n);
//		System.out.println(dp[n-1]);
//		sc.close();
//	}
//	static long tile(int n) {
//		if (dp[n] != 0) {
//			return dp[n];
//		}
//		return dp[n] = (tile(n-1) + tile(n-2)) % 15746;
//	}
//}