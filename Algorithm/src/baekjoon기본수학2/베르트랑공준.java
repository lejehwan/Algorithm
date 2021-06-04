package baekjoon기본수학2;

import java.util.Scanner;

public class 베르트랑공준 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int cnt = 0;
			for (int i = n + 1; i <= n*2; i++) {
				boolean check = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						check = false;
						break;
					}
				}
				if (check) {
					cnt++;
				}
			}
			System.out.println(cnt);
			n = sc.nextInt();
		}
		sc.close();
	}
}
//public class 소수구하기 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = 1;
//		while (n != 0) {
//			n = sc.nextInt();
//			int cnt = 0;
//			boolean[] check = new boolean[10000000];
//			for (int i = 2; i <= 2 * n; i++) {
//				check[i] = true;
//			}
//			for (int i = 2; i <= Math.sqrt(2 * n); i++) {
//				if (check[i]) {
//					for (int j = 2; j * i <= 2 * n; j++) {
//						check[i * j] = false;
//					}
//				}
//			}
//			for (int i = n + 1; i <= 2 * n; i++) {
//				if (check[i] && i > 1) {
//					cnt++;
//				}
//			}
//			System.out.println(cnt);
//		}
//	}
//}
