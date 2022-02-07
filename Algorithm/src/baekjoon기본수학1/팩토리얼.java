package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 팩토리얼 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(fac(Integer.parseInt(br.readLine())));
	}

	public static int fac(int n) {
		return n <= 1 ? 1 : fac(n - 1) * n;
	}
}
