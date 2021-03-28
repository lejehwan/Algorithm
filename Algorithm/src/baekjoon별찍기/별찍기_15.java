package baekjoon별찍기;

import java.util.Scanner;

public class 별찍기_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = n; j <= n; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i*2-1; j++) {
				System.out.print(" ");
			}
			if (i != 0) {
				for (int j = n; j <= n; j++) {
					System.out.print("*");
				}
			}			
			System.out.println();
		}
		sc.close();
	}
}
