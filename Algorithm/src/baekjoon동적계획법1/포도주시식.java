package baekjoon동적계획법1;

import java.util.Scanner;

public class 포도주시식 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] podo = new int[10001];
		int[] dp = new int[10001];
		for (int i = 1; i <= n; i++) {
			podo[i] = sc.nextInt();
		}
		dp[1] = podo[1];
		dp[2] = podo[1] + podo[2];
		for (int i = 3; i < dp.length; i++) {
			int case1 = dp[i-1];// OOX
			int case2 = dp[i-2] + podo[i];// OXO
			int case3 = dp[i-3] + podo[i-1] + podo[i];// XOO 이므로 dp[i-3]의 값 + 2번째 O(podo[i-1]) + 3번째 O(podo[i])
			dp[i] = Math.max(case1, Math.max(case2, case3));
		}
		System.out.println(dp[n]);
		sc.close();
	}
}
