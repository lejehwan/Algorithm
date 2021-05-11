package baekjoon분할정복;

import java.util.Scanner;

public class 색종이만들기 {
	static int[][] paper;
	static int w;
	static int b;

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
		System.out.println(w);
		System.out.println(b);
		sc.close();
	}

	// 나눈 부분에 대한 판별
	public static void divide(int x, int y, int n) {
		// 나눈 부분이 같다 -> 색종이 개수 증가
		if (colorcheck(x, y, n)) {
			if (paper[x][y] == 1) {
				b++;
			} else {
				w++;
			}
			return;
		}
		// 나눈 부분이 같지 않다 -> 분할
		int newn = n / 2;
		// 2 1	-> 1 4
		// 3 4     2 3
		divide(x, y, newn);// 2사분면
		divide(x, y + newn, newn);// 1사분면
		divide(x + newn, y, newn);// 3사분면
		divide(x + newn, y + newn, newn);// 4사분면
	}

	// 해당 부분의 색 판별
	public static boolean colorcheck(int x, int y, int n) {
		// 첫번째 색종이 색
		int color = paper[x][y];
		// 첫번째 색종이의 색과 나머지 부분이 같은 지 확인
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (paper[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}
