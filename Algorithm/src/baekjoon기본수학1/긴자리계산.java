package baekjoon기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class 긴자리계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		System.out.println(n.add(m));
		System.out.println(n.subtract(m));
		System.out.println(n.multiply(m));
		sc.close();
	}
}
