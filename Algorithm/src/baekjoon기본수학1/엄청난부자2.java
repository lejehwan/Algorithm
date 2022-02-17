package baekjoon기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class 엄청난부자2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		sc.close();
	}
}

