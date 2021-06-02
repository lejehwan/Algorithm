package baekjoon기본수학1;

import java.util.Scanner;

public class ACM호텔 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			String head = "";
			String tail = "";
			if (n % h == 0) {
				head = String.valueOf(h);
				tail = String.valueOf(n / h);
			} else {
				head = String.valueOf(n % h);
				tail = String.valueOf(n / h + 1);
			}
			if (tail.length() == 1) {
				tail = "0" + tail;
			}
			System.out.println(head + tail);
		}
		sc.close();
	}
}
