package baekjoon그리디;

import java.util.Scanner;

public class 동전0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coin = new int[n];
		int answer = 0;
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		for (int i = coin.length-1; i >= 0; i--) {
			if (coin[i] <= k) {
				answer += k / coin[i];
				k %= coin[i];
				if (k == 0) {
					break;
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
