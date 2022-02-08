package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 조합0의개수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		long n = Integer.parseInt(input[0]);
		long m = Integer.parseInt(input[1]);
		long temp5 = fac5(n) - fac5(n - m) - fac5(m);
		long temp2 = fac2(n) - fac2(n - m) - fac2(m);
		System.out.println(Math.min(temp5, temp2));
	}

	public static int fac5(long x) {
		int cnt = 0;
		while (x >= 5) {
			cnt += x / 5;
			x /= 5;
		}
		return cnt;
	}

	public static int fac2(long y) {
		int cnt = 0;
		while (y >= 2) {
			cnt += y / 2;
			y /= 2;
		}
		return cnt;
	}
}
