package baekjoon동적계획법1;

import java.util.Scanner;

public class 가장큰증가부분수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = input[i];
			for (int j = 0; j < i; j++) {
				if (input[i] > input[j]) {
					dp[i] = Math.max(dp[i], dp[j] + input[i]);
				}
			}
			System.out.println(dp[i]);
		}
		int max = 0;
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		sc.close();
	}
}
