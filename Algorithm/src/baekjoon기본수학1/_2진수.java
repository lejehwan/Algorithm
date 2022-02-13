package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2진수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = Integer.parseInt(br.readLine());
		if (input == 0) {
			sb.append(0);
		}else {
			while (input != 1) {
				sb.append(Math.abs(input % -2));
				input = (int) Math.ceil((double) input / -2);
			}
			sb.append(input);
		}
		System.out.println(sb.reverse());
	}
}
