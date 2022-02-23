package baekjoon동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 이친수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
//		long[][] dp = new long[n + 1][2];
//		dp[1][1] = 1;// 맨 앞은 무조건 1 이여야 하므로
//		if (n >= 2) {
//			dp[2][0] = 1;// 그 다음 자리는 무조건 0 이어야 하므로
//		}
//		for (int i = 3; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				dp[i][0] = dp[i - 1][1] + dp[i - 1][0];
//				dp[i][1] = dp[i - 1][0];
//			}
//		}
//		long answer = dp[n][0] + dp[n][1];
//		System.out.println(answer);

		
		
		
		long[] dp = new long[n + 1];
		dp[1] = 1;
		if (n >= 2) {
			dp[2] = 1;
		}
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[n]);

	}
}
