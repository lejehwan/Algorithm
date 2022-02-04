package baekjoon분류모름;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 단어뒤집기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] sentence = br.readLine().split(" ");
			for (int j = 0; j < sentence.length; j++) {
				temp.append(sentence[j]);
				String convert = temp.reverse().toString();
				sb.append(convert + " ");
				temp.setLength(0);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
