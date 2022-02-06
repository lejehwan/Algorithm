package baekjoon기본수학1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
		System.out.println(c / a);
		sc.close();
	}
}
