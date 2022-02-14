package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 진법변환 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String[] n = input[0].split("");
		int m = Integer.parseInt(input[1]);
		char[] ch = new char[36];
		for (int i = 0; i < ch.length; i++) {
			if (i < 10) {
				ch[i] = (char) (i + '0');
			} else {
				ch[i] = (char) (i + 'A' - 10);
			}
		}
		int answer = 0;
		for (int i = 0; i < n.length; i++) {
			int temp = 0;
			for (int j = 0; j < ch.length; j++) {
				if (n[i].equals(String.valueOf(ch[j]))) {
					temp = j;
					break;
				}
			}
			answer += Math.pow(m, n.length - i - 1) * temp;
		}
		System.out.println(answer);
	}

}
