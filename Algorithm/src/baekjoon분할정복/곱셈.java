package baekjoon분할정복;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 일반 풀이 => 시간초과
// 지수 법칠 + 모듈러 연산으로 풀이
// 모듈러 연산 => (a*b)%c = (a%c*b%c)%c
// 지수가 짝수 일 때 절반씩 분할
// 지수가 홀수 일 때 모듈러 연산으로 구함

public class 곱셈 {
	static long c;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		long a = Integer.parseInt(input[0]);
		long b = Integer.parseInt(input[1]);
		c = Integer.parseInt(input[2]);
		bw.write(String.valueOf(pow(a, b)));
		bw.flush();
		bw.close();
	}

	public static long pow(long a, long b) {
		// b를 한번만 곱하는 것
		if (b == 1) {
			return a % c;
		}
		// 짝 / 홀로 분할
		long temp = pow(a, b / 2);
		if (b % 2 == 1) {
			// 홀수라면 모듈러 연산
			return (temp * temp % c) * a % c;
		}
		// 짝수라면 구했던 값을 한번 더 곱함
		return temp * temp % c;
	}
}
