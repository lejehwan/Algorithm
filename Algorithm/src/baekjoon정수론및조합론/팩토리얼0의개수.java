package baekjoon정수론및조합론;

import java.math.BigInteger;
import java.util.Scanner;

// 뒷자리가 0이 나오기 위해서는 2 * 5 = 10일 경우이다.
// 5! = 120 => 2*2*2**3*5 => 0의 개수 : 1
// 10! = .. => 2의 8승 * 3의 4승 * 5의 2승 * 7 10의 개수 : 2
// 15! = ...10의 개수 : 3
// 20! = ...10의 개수 : 4
// 25! = ... 2의 22승  * 5의 6승 => 10의 개수 : 6 주의!!!!!!!!!!!!!!!!!(25!일 경우 0의 개수가 2개 증가함)
// 2의 개수보다 5의 개수가 적기 때문에 5의 x승의 10의 개수가 x개 가 된다.

public class 팩토리얼0의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while (n >= 5) {
			cnt += n / 5;
			n /= 5;	
		}
		System.out.println(cnt);
		sc.close();
	}
}


//public class 팩토리얼0의개수 {
//	public static void main(String[] args) {	
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int cnt = 0;
//		BigInteger a = BigInteger.ONE;
//		for(int i = n; i > 1; i--) {
//			a = a.multiply(BigInteger.valueOf(i));
//			if(a.remainder(BigInteger.TEN) == BigInteger.ZERO) {
//				cnt++;
//				a = a.divide(BigInteger.TEN);
//			}
//		}
//		System.out.println(cnt);
//		sc.close();
//	}	
//}
