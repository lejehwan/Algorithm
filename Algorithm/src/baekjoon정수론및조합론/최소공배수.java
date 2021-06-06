package baekjoon정수론및조합론;

import java.util.Scanner;

public class 최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int mul = x * y;
			while (y != 0) {
				int temp = x % y;
				x = y;
				y = temp;
			}
			System.out.println(mul / x);
		}
		sc.close();
	}
}
