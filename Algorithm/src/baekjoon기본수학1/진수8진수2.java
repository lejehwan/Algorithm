package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 진수8진수2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split("");
		String answer = "";
		if (input[0].equals("0") && input.length == 1) {
			answer = "0";
		}else {
			for (int i = 0; i < input.length; i++) {
				int temp = Integer.parseInt(input[i]);
				sb.append(temp / 4);
				if (temp >= 4) {
					temp -= 4;
				}
				sb.append(temp / 2);
				if (temp >= 2) {
					temp -= 2;
				}
				sb.append(temp / 1);
			}
			answer = sb.toString();
			if (answer.split("")[0].equals("0")) {
				answer = (String) answer.subSequence(1, answer.length());
			}
			if (answer.split("")[0].equals("0")) {
				answer = (String) answer.subSequence(1, answer.length());
			}
		}
		System.out.println(answer);
	}

}
