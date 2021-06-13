package baekjoonClass_2_3;

import java.util.Scanner;

// 최대 L이 49 이므로 Math.pow()사용시 초과
// 31을 곱하고 mod로 나누어 준 값을 원래 값에 곱하는 방식으로 줄여야 함

public class Hashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int mod = 1234567891;
		long sum = 0;
		long r = 1;
		for (int i = 0; i < n; i++) {
			sum += (str.charAt(i) - 96) * r;
			sum %= mod;
			r *= 31;
			r %= mod;
		}
		System.out.println(sum);
		sc.close();
	}
}