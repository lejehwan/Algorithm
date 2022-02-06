package baekjoon문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사배열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] post = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			post[i] = str.substring(i, str.length());
		}
		Arrays.sort(post);
		for (String val : post) {
			System.out.println(val);
		}
	}
}
