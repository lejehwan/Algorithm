package baekjoon분할정복;

import java.util.Scanner;

public class 종이의개수 {
	static int[][] paper;
	static int zero, one, mone;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		paper = new int[n][n];
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper.length; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		divide(0, 0, n);
		System.out.println(mone + "\n" + zero + "\n" + one);
		sc.close();
	}

	public static void divide(int x, int y, int n) {
		if (same(x, y, n)) {
			if (paper[x][y] == -1) {
				mone++;
			} else if (paper[x][y] == 0) {
				zero++;
			} else {
				one++;
			}
			return;
		}
		int newn = n / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				divide(x + newn * i, y + newn * j, newn);
			}
		}
	}

	public static boolean same(int x, int y, int n) {
		int temp = paper[x][y];
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (temp != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
