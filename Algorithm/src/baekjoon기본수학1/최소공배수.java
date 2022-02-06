package baekjoon기본수학1;

import java.util.Scanner;

public class 최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a * b;
			while (b != 0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			System.out.println(c / a);
		}
		sc.close();
	}
}
