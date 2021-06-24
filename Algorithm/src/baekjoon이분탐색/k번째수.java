package baekjoon이분탐색;

import java.util.Scanner;

public class k번째수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int left = 1;
		int right = k;
		int answer = 0;
		while (left <= right) {
			int cnt = 0;
			int mid = (left + right) / 2;
			for (int i = 1; i <= n; i++) {
				cnt += Math.min(mid/i, n);
			}
			if (cnt < k) {
				left = mid + 1;
			}else {
				right = mid - 1;
				answer = mid;
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
