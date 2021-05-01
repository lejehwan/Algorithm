package 동적계획법1;

import java.util.Scanner;

public class 피보나치함수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[41][2];
		dp[0][0] = 1;
		dp[1][1] = 1;
		for (int i = 2; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = dp[i-1][j] + dp[i-2][j];
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(dp[i][0] + " " + dp[i][1]);
		}
		sc.close();
	}
}
