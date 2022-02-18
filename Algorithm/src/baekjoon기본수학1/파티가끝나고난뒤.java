package baekjoon기본수학1;

import java.util.Scanner;

public class 파티가끝나고난뒤 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c = new int[5];
		for (int i = 0; i < 5; i++) {
			c[i] = sc.nextInt();
			System.out.print(c[i] - a * b + " ");
		}
		sc.close();
	}
}
