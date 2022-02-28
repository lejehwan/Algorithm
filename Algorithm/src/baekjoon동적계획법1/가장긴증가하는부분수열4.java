package baekjoon동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 가장긴증가하는부분수열4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n + 1];
		int[] dp = new int[n + 1];
		String[] temp = br.readLine().split(" ");
		for (int i = 1; i < dp.length; i++) {
			input[i] = Integer.parseInt(temp[i - 1]);
			dp[i] = 1;
		}
		for (int i = 2; i < dp.length; i++) {
			for (int j = 1; j < i; j++) {
				if (input[i] > input[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		int answer = 0;
		for (int i = 1; i < dp.length; i++) {
			answer = Math.max(dp[i], answer);
		}
		sb.append(answer + "\n");

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = n; i >= 1; i--) {
			if (answer == dp[i]) {
				stack.push(input[i]);
				answer--;
			}
		}
		while (!stack.empty()) {
			sb.append(stack.pop() + " ");
		}
		System.out.println(sb.toString());
	}
}
