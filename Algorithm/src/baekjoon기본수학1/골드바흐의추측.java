package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 골드바흐의추측 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		boolean[] check = new boolean[1000001];
		check[0] = check[1] = true;
		for (int i = 2; i <= Math.sqrt(1000000); i++) {
			if (!check[i]) {
				for (int j = 2; j * i <= 1000000; j++) {
					check[i * j] = true;
				}
			}
		}
		while ((n = Integer.parseInt(br.readLine())) != 0) {

			boolean flag = false;
			for (int i = 2; i < n + 1; i++) {
				int temp = n - i;
				if (!check[i] && !check[temp]) {
					sb.append(n + " = " + i + " + " + temp + "\n");
					flag = true;
					break;
				}
			}
			if (!flag) {
				sb.append("Goldbach's conjecture is wrong.\n");
			}
		}
		System.out.println(sb.toString());
	}
}
