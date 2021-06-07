package baekjoon정수론및조합론;

import java.util.Scanner;

public class 링 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ring = new int[n];
		for (int i = 0; i < ring.length; i++) {
			ring[i] = sc.nextInt();
		}
		int first = ring[0];
		for (int i = 1; i < ring.length; i++) {
			int gong = gcd(first, ring[i]);
			System.out.println(first / gong + "/" + ring[i] / gong);
		}
		sc.close();
	}

	public static int gcd(int x, int y) {
		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		return x;
	}
}
