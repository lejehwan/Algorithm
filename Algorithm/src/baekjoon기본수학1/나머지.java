package baekjoon기본수학1;

import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sb.append((a + b) % c + "\n");
		sb.append(((a % c) + (b % c)) % c + "\n");
		sb.append((a * b) % c + "\n");
		sb.append(((a % c) * (b % c)) % c);
		System.out.println(sb.toString());
		sc.close();
	}
}
