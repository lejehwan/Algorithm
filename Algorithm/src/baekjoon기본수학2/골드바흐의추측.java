package baekjoon기본수학2;

import java.util.Scanner;

public class 골드바흐의추측 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			boolean[] check = new boolean[10001];
			int n = sc.nextInt();
			for (int j = 2; j < n; j++) {
				check[j] = true;
			}
			for (int j = 2; j < Math.sqrt(n); j++) {
				if (check[j]) {
					for (int k = 2; j * k <= n; k++) {
						check[j * k] = false;
					}
				}
			}
			int head = n / 2;
			int tail = n / 2;
			int sub = 0;
			while (true) {
				if (check[head - sub] && check[tail + sub]) {
					System.out.println((head - sub) + " " + (tail + sub));
					break;
				}
				sub++;
			}
		}
		sc.close();
	}
}
