package baekjoon문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열분석 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String temp = "";
		while ((temp = br.readLine()) != null) {
			int[] answer = new int[4];
			char[] str = temp.toCharArray();
			for (int i = 0; i < str.length; i++) {
				if (str[i] >= 65 && str[i] <= 90) {
					answer[1] ++;
				}else if (str[i] >= 97 && str[i] <= 122) {
					answer[0] ++;
				}else if (str[i] >= 48 && str[i] <= 57) {
					answer[2] ++;
				}else if (str[i] == 32) {
					answer[3] ++;
				}
			}
			sb.append(answer[0] + " " + answer[1] + " " + answer[2] + " " + answer[3] + "\n");
		}
		System.out.println(sb.toString());
	}
}
