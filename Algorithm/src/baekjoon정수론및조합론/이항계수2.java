package baekjoon정수론및조합론;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 모듈러 연산
// 하지만 모듈러 연산은 나눗셈은 없기 때문에 모듈러 역원 => 페르마의 소정리
// a의 p승 % p == a % p (a는 정수 p는 소수이며 a와p는 배수관계가 아닐 때 성립)
// 결론적으로  nCk mod p = ((n! mod p) * (k!(n-k!)10007 - 2승  mod p)) mod p

// 아래는 모듈러의 역원을 이용한 풀이

//public class 이항계수2 {
//	public static final int div = 10007;
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int N = Integer.parseInt(st.nextToken());
//		int K = Integer.parseInt(st.nextToken());
//		/*
//		 * n! / ((n-k)! * k!) -> n! * ((n-k)! * k!)^(-1) 으로 변환 ((n-k)! * k!)^(-1) ==
//		 * ((n-k)! * k!)^(p-2) 동치 p(=div)가 소수여서 가능함)
//		 */
//		System.out.println((factorial(N) * mod_inverse((factorial(N - K) * factorial(K)) % div, div - 2)) % div);
//	}
//
//	static int factorial(int N) {
//		// factorial(0) == 1 이다.
//		if (N <= 1) {
//			return 1;
//		}
//		return (N * factorial(N - 1)) % div;
//	}
//
//	// 역원 구하기 (= 제곱승 구하기)
//	static int mod_inverse(int a, int p) {
//		int ret = 1;
//		while (p > 0) {
//			if (p % 2 == 1) {
//				ret *= a;
//				p--;
//				ret %= div;
//			}
//			a *= a;
//			a %= div;
//			p >>= 1; // p = p/2 랑 동치
//		}
//		return ret;
//	}
//}

// 동적계획법 풀이
// 6C3 = 5C2 + 5C3
public class 이항계수2 {
	static int[][] dp;
	public static final int div = 10007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		dp = new int[n + 1][k + 1];
		System.out.println(fun(n, k));
		sc.close();
	}

	static int fun(int n, int k) {
		// 이미 구한 값이면 해당 값을 가져옴
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}
		return dp[n][k] = (fun(n - 1, k - 1) + fun(n - 1, k)) % div;
	}
}

