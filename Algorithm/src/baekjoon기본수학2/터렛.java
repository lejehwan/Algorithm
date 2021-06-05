package baekjoon기본수학2;

import java.util.Scanner;

public class 터렛 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			int dotdistance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			int rhap = r1 + r2;
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			} else if (dotdistance > rhap * rhap) {
				System.out.println(0);
			} else if (dotdistance < Math.pow(r1 - r2, 2)) {
				System.out.println(0);
			} else if (dotdistance == Math.pow(r1 - r2, 2)) {
				System.out.println(1);
			} else if (dotdistance == rhap * rhap) {
				System.out.println(1);
			} else if (dotdistance < rhap * rhap) {
				System.out.println(2);
			}
		}
		sc.close();
	}
}
