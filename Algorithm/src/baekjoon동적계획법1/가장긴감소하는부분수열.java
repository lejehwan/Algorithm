package baekjoon동적계획법1;

import java.util.Scanner;

public class 가장긴감소하는부분수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			dp[i] = 1;
			for (int j = n - 1; j > i; j--) {
				if (input[i] > input[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		sc.close();
	}
}
