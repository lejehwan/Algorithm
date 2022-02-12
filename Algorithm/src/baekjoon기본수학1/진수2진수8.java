package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 진수2진수8 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split("");
		if (input.length % 3 == 1) {
			sb.append(input[0]);
		} else if (input.length % 3 == 2) {
			sb.append(Integer.parseInt(input[0]) * 2 + Integer.parseInt(input[1]));
		}
		for (int i = input.length % 3; i < input.length; i += 3) {
			sb.append(Integer.parseInt(input[i]) * 4 
					+ Integer.parseInt(input[i + 1]) * 2 
					+ Integer.parseInt(input[i + 2]));
		}
		System.out.println(sb.toString());
	}
}
