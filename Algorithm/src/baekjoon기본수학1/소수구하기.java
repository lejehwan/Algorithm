package baekjoon기본수학1;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] check = new boolean[m + 1];
		check[0] = check[1] = true;
		for (int i = 2; i <= Math.sqrt(m); i++) {
			if (check[i] == false) {
				for (int j = 2; i * j <= m; j++) {
					check[i * j] = true;
				}
			}
		}
		for (int i = n; i < m + 1; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
