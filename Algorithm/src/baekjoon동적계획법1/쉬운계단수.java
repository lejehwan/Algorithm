package baekjoon동적계획법1;

import java.util.Scanner;

public class 쉬운계단수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mod = 1000000000;
		// n개이 자릿값을 표현하고,자릿값은 0~9까지 가질수 있음
		int[][] dp = new int[n + 1][10];
		// 첫 번째 자릿수는 경우의 수가 => 1
		for (int i = 1; i < dp[0].length; i++) {
			dp[1][i] = 1;
		}
		// 두 번째 자릿수 부터 ...
		for (int i = 2; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				// 자릿값이 0이면 이전 자릿수로 올 수 는 1뿐
				if (j == 0) {
					dp[i][0] = dp[i - 1][1] % mod;
					// 자릿값이 9면 이전 자릿수로 올 수는 8뿐
				} else if (j == 9) {
					dp[i][9] = dp[i - 1][8] % mod;
					// 그 외는 이전 자리수의 -1, +1의 합
				} else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
				}
			}
		}
		long answer = 0;
		for (int i = 0; i < dp[0].length; i++) {
			answer += dp[n][i];
		}
		answer %= mod;
		System.out.println(answer);
		sc.close();
	}
}
