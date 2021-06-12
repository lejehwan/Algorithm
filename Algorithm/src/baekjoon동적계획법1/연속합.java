package baekjoon동적계획법1;

import java.util.Scanner;

public class 연속합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		dp[0] = input[0];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.max(input[i], dp[i-1] + input[i]);
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		sc.close();
	}
}
