package baekjoon분류모름;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 알파벳개수 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] alpha = br.readLine().toCharArray();
		int[] answer = new int[26];
		for (int i = 0; i < alpha.length; i++) {
			answer[alpha[i] - 97]++;
		}
		for (int val : answer) {
			sb.append(val+ " ");
		}
		System.out.println(sb.toString().trim());
	}
}
