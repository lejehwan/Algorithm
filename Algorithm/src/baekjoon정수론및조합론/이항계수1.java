package baekjoon정수론및조합론;

import java.util.Scanner;

public class 이항계수1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int up = 1;
		for (int i = x-y+1; i <= x; i++) {
			up *= i;
		}
		int down = 1;
		for (int i = 1; i <= y; i++) {
			down *= i;
		}
		System.out.println(up/down);
		sc.close();
	}
} 
