package baekjoon문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ROT13 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 65 && str[i] <= 90) {
				if (str[i] >= 78) {
					sb.append((char)(str[i] - 13));
				} else {
					sb.append((char)(13 + str[i]));
				}
			} else if (str[i] >= 97 && str[i] <= 122) {
				if (str[i] >= 110) {
					sb.append((char)(str[i] - 13));
				} else {
					sb.append((char)(13 + str[i]));
				}
			}else {
				sb.append(str[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
