package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 진법변환2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		char[] ch = new char[36];
		for (int i = 0; i < ch.length; i++) {
			if (i < 10) {
				ch[i] = (char) (i + '0');
			} else {
				ch[i] = (char) (i + 'A' - 10);
			}
		}
		while (n > 0) {
			sb.append(ch[n % m]);
			n /= m;
		}
		System.out.println(sb.reverse());
	}
}
