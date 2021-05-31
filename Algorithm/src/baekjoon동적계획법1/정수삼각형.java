package baekjoon동적계획법1;

import java.util.Scanner;

public class 정수삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] tri = new int[n][n];
		int[][] dp = new int[n][n];
		for (int i = 0; i < tri.length; i++) {
			for (int j = 0; j <= i; j++) {
				tri[i][j] = sc.nextInt();
			}
		}
		// 첫째 줄 고정
		dp[0][0] = tri[0][0];
		// 2차원 배열로 판단하므로 왼쪽대각선 -> 아래,오른쪽대각선 -> 오른쪽대각선으로 생각
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j <= i; j++) {
				// 만약 맨 왼쪽 줄 일 경우 전단계 열만 봄 + 현재 위치값
				if (j == 0) {
					dp[i][j] = dp[i - 1][j] + tri[i][j];
					// 위 조건이 아니라면 전단계 열과 전단계 [열][행-1]중 최댓값 + 현재 위치값
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + tri[i][j];
				}
			}
		}
		int sum = dp[n - 1][0];
		for (int i = 1; i < dp.length; i++) {
			if (sum < dp[n - 1][i]) {
				sum = dp[n - 1][i];
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
