package baekjoon동적계획법1;

import java.util.Scanner;

public class 가장긴증가하는부분수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n];
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			// 판별할 dp의 값을 1로 초기화
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				// 판별할 dp의 값이 현재 dp의 왼쪽에 있는 값들 중 큰 값이면
				if (input[i] > input[j]) {
					// 증가하는 길이dp[j] + 1만큼 저장
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}
}
