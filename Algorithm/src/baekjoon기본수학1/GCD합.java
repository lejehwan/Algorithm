package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			long sum = 0;
			String[] input = br.readLine().split(" ");
			for (int j = 1; j < Integer.parseInt(input[0]); j++) {
				for (int k = j + 1; k < Integer.parseInt(input[0]) + 1; k++) {
					sum += GCD(Integer.parseInt(input[j]), Integer.parseInt(input[k]));
				}
			}
			System.out.println(sum);
		}
	}

	public static int GCD(int x, int y) {
		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		return x;
	}

}

