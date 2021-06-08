package baekjoon정수론및조합론;

import java.util.Scanner;

// nCr = n! / (n-r)! * r!
// n! = 2의 a1승 * 5의 a2승, (n-r)! = 2의 b1승 * 5의 b2승, r! = 2의 c1승 * 5의 c2승  로 변환 시켜 간략히 하면
// => 2의 a1승 / (2의 b1승 * 2의 c1승) * 5의 a2승 / (5의 b2승 * 5의 c2승)  이렇게 바꿀 수 있다.
// 따라서 2의 승수(a1-b1-c1) 5의 승수(a2-b2-c2)중 최솟값이 0의 개수이다.

public class 조합0의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long cnt5 = five(n) - five(n - m) - five(m);
		long cnt2 = two(n) - two(n - m) - two(m);
		System.out.println(Math.min(cnt5, cnt2));
		sc.close();
	}

	public static long five(long n) {
		int temp = 0;
		while (n >= 5) {
			temp += n / 5;
			n /= 5;
		}
		return temp;
	}

	public static long two(long x) {
		int temp = 0;
		while (x >= 2) {
			temp += x / 2;
			x /= 2;
		}
		return temp;
	}
}
