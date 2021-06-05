package baekjoon기본수학2;

import java.util.Scanner;

public class 택시기하학 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		System.out.println(r * r * Math.PI);
		System.out.println(2 * r * r);
		sc.close();
	}
}
