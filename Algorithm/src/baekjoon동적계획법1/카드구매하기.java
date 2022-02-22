package baekjoon동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 카드구매하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[100001][4];
		dp[1][1] = 1;
//		dp[1][2] = 0;
//		dp[1][3] = 0;
//		dp[2][1] = 0;
		dp[2][2] = 1;
//		dp[2][3] = 0;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			for (int j = 4; j <= m; j++) {
				dp[j][1] = (dp[j - 1][2] + dp[j - 1][3]) % 1000000009;
				dp[j][2] = (dp[j - 2][1] + dp[j - 2][3]) % 1000000009;
				dp[j][3] = (dp[j - 3][1] + dp[j - 3][2]) % 1000000009;
			}
			System.out.println((dp[m][1] + dp[m][2] + dp[m][3]) % 1000000009);
		}
	}
}
