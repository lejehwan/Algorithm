package baekjoon정수론및조합론;

import java.util.Scanner;

public class 배수와약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			boolean check = false;
			if (x < y) {
				for (int i = 1; i <= y/x; i++) {
					if (x * i == y) {
						System.out.println("factor");
						check = true;
						break;
					}
				}
				if (!check) {
					System.out.println("neither");
				}
			}else {
				for (int i = 1; i <= x/y; i++) {
					if (x == y * i) {
						System.out.println("multiple");
						check = true;
						break;
					}
				}
				if (!check) {
					System.out.println("neither");
				}
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
