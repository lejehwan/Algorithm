package baekjoon동적계획법1;

import java.util.Scanner;

// bottom-up
public class 파도반수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[101];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		for (int i = 5; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-5];
		}
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			System.out.println(dp[m]);
		}
		sc.close();
	}
}

//// top-down
//class 파도반수열 {
//	static long[] dp = new long[101];
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		dp[1] = 1;
//		dp[2] = 1;
//		dp[3] = 1;
//		dp[4] = 2;
//		dp[5] = 2;
//		for (int i = 0; i < n; i++) {
//			int m = sc.nextInt();
//			System.out.println(padovan(m));
//		}
//		sc.close();
//	}
//
//	static long padovan(int n) {
//		if (dp[n] != 0) {
//			return dp[n];
//		}
//		return dp[n] = padovan(n-1) + padovan(n-5);
//	}
//}