package baekjoon분할정복;

import java.util.Scanner;

public class 쿼드트리 {
	static int[][] qt;
	static int n;
	static StringBuilder sb;

	public static void main(String[] args) {
		// scanner() 로 입력 받는 것 보다는 BufferdReader()로 입력받는게 효율적(문자열 입력 받기)
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		qt = new int[n][n];
		sb = new StringBuilder();
		for (int i = 0; i < qt.length; i++) {
			String line = sc.next();
			for (int j = 0; j < qt.length; j++) {
				qt[i][j] = line.charAt(j) - '0';
			}
		}
		divide(0, 0, n);
		System.out.println(sb.toString());
		sc.close();
	}

	public static void divide(int x, int y, int n) {
		if (!colorcheck(x, y, n)) {
			sb.append("(");
			int newn = n / 2;
			// 반복문으로 (1~4분면)재귀 돌림
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					divide(x + newn * i, y + newn * j, newn);
				}
			}
			sb.append(")");
		}
	}

	public static boolean colorcheck(int x, int y, int n) {
		int temp = qt[x][y];
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (temp != qt[i][j]) {
					return false;
				}
			}
		}
		sb.append(temp);
		return true;
	}
}
