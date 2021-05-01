package baekjoon브루트포스;

import java.util.Scanner;

public class 덩치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] big = new int[n][2];
		int[] rank = new int[n];
		for (int i = 0; i < big.length; i++) {
			big[i][0] = sc.nextInt();
			big[i][1] = sc.nextInt();
		}
		for (int i = 0; i < big.length; i++) {
			int cnt = 0;
			for (int j = 0; j < big.length; j++) {
				if (big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
					cnt++;
				}
			}
			rank[i] = cnt+1;
		}
		for (int i : rank) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
