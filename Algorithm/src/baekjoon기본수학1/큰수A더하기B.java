package baekjoon기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수A더하기B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger x = new BigInteger(sc.next());
		BigInteger y = new BigInteger(sc.next());
		BigInteger answer = x.add(y);
		System.out.println(String.valueOf(answer));
		sc.close();
	}
}
