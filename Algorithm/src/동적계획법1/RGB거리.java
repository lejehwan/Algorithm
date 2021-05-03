package 동적계획법1;

import java.util.Scanner;

public class RGB거리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] rgb = new int[n][3];
		int[][] dp = new int[n][3];
		for (int i = 0; i < rgb.length; i++) {
			rgb[i][0] = sc.nextInt();
			rgb[i][1] = sc.nextInt();
			rgb[i][2] = sc.nextInt();
		}
		// 처음 r, g, b 는 고정
		dp[0][0] = rgb[0][0];
		dp[0][1] = rgb[0][1];
		dp[0][2] = rgb[0][2];
		// 2번째 줄의 (현 위치의 값 = 전 위치의 최솟값 + 현재값 )으로 정함
		for (int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + rgb[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + rgb[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + rgb[i][2];
		}
		// 마지막의 r, g, b 중 가장 작은 값을 출력
		System.out.println(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
		sc.close();
	}
}
