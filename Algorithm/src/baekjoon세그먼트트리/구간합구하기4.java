package baekjoon세그먼트트리;

import java.util.Scanner;

public class 구간합구하기4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] inteval = new int[n+1];
		for (int i = 1; i < inteval.length; i++) {
			inteval[i] = inteval[i-1] + sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(inteval[b] - inteval[a-1]);
		}
		sc.close();
	}
}
