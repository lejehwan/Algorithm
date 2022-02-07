package baekjoon기본수학1;

import java.util.Scanner;

public class 팩토리얼0의개수 {

	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fac(sc.nextInt()));
		sc.close();
	}

	public static int fac(int n) {
		if (n >= 5) {
			cnt += n / 5;
			return fac(n / 5);
		}
		return cnt;
	}
}
