package baekjoon기본수학2;

import java.util.Scanner;

public class 소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int first = 0;
		for (int i = m; i <= n; i++) {
			if (i == 1) {
				continue;
			}
			boolean check = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				if (sum == 0) {
					first = i;
				}
				sum += i;
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(first);
		}
		sc.close();
	}
}
