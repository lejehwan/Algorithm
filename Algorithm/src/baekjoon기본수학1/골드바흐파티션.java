package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 골드바흐파티션 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] check = new boolean[1000001];
		check[0] = check[1] = true;
		for (int j = 2; j <= Math.sqrt(1000000); j++) {
			if (!check[j]) {
				for (int k = 2; k * j <= 1000000; k++) {
					check[j * k] = true;
				}
			}
		}
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			int cnt = 0;
			for (int j = 2; j <= m / 2; j++) {
				if (!check[j] && !check[m - j]) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.println(sb.toString());
	}
}
