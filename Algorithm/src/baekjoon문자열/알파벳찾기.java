package baekjoon분류모름;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 알파벳찾기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] alpha = br.readLine().toCharArray();
		int[] answer = new int[26];
		int[] location = new int[26];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = -1;
		}
		for (int i = 0; i < alpha.length; i++) {
			int input = alpha[i] - 97;
			if (answer[input] != -1) {
				answer[input] = location[input];
			}else {
				answer[input] = i;
				location[input] = i;	
			}
		}
		for (int val : answer) {
			sb.append(val + " ");
		}
		System.out.println(sb.toString().trim());
	}
}
