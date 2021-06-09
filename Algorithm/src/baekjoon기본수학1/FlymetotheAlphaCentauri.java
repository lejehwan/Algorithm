package baekjoon기본수학1;

import java.util.Scanner;

public class FlymetotheAlphaCentauri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dist = y - x;
			int max = (int) Math.sqrt(dist);
			if (max == Math.sqrt(dist)) {
				System.out.println(max * 2 - 1);
			} else if (dist <= max * max + max) {
				System.out.println(max * 2);
			} else {
				System.out.println(max * 2 + 1);
			}
		}
		sc.close();
	}
}