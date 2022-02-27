package baekjoon동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 카드구매하기2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n + 1];
		int[] dp = new int[n + 1];
		String[] value = br.readLine().split(" ");
		for (int i = 1; i < input.length; i++) {
			input[i] = Integer.parseInt(value[i - 1]);
		}
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j] + input[j]);
			}
		}
		System.out.println(dp[n]);
	}
}