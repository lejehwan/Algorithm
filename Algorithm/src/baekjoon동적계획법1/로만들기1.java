package baekjoon동적계획법1;

import java.util.Scanner;

// 1. 1을 빼준다
// 2. 3으로 나누어질 경우 => 연산횟수가 적은 것 선택
// 3. 2로 나누어질 경우 => 연산횟수가 적은 것 선택

public class 로만들기1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		dp[1] = 0;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}
		}
		System.out.println(dp[n]);
		sc.close();
	}
}
