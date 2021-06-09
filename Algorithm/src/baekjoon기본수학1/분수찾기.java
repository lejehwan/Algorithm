package baekjoon기본수학1;

import java.util.Scanner;

public class 분수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		int sum = 0;
		while (true) {
			if (n <= cnt + sum) {
				if (cnt % 2 == 1) {
					System.out.println((cnt - n + sum + 1) + "/" + (n - sum));
					break;
				} else {
					System.out.println((n - sum) + "/" + (cnt - n + sum + 1));
					break;
				}
			} else {
				sum += cnt;
				cnt++;
			}
		}
	}
}
