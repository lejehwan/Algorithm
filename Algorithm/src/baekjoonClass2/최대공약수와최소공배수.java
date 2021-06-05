package baekjoonClass2;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x * y;
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		System.out.println(x);
		System.out.println(z / x);
		sc.close();
	}
}
