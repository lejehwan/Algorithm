package baekjoon정수론및조합론;

import java.util.Scanner;

public class 다리놓기 {
	static int[][] comb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			comb = new int[n + 1][m + 1];
			System.out.println(dp(n, m));
		}
		sc.close();
	}

	public static int dp(int x, int y) {
		if (comb[x][y] > 0) {
			return comb[x][y];
		}
		if (y == 0 || x == y) {
			return comb[x][y] = 1;
		}
		return comb[x][y] = dp(x - 1, y - 1) + dp(x - 1, y);
	}
}
