package baekjoon기본수학2;

import java.util.Scanner;

public class 직사각형에서탈출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int temp = Math.min(w-x, x);
		int temp2 = Math.min(h-y, y);
		System.out.println(Math.min(temp, temp2));
		sc.close();
	}
}
