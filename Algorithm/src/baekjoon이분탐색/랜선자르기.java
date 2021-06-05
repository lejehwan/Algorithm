package baekjoon이분탐색;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 랜선자르기 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long n = sc.nextLong();
		long[] lan = new long[k];
		for (int i = 0; i < lan.length; i++) {
			lan[i] = sc.nextLong();
		}
		Arrays.sort(lan);
		long max = lan[lan.length - 1];
		long min = 1;
		while (max >= min) {
			long cnt = 0;
			long mid = (max + min) / 2;
			for (int i = 0; i < lan.length; i++) {
				cnt += lan[i] / mid;
			}
			if (cnt >= n) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		System.out.println(max);
	}
}
