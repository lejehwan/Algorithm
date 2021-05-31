package baekjoon백트래킹;

import java.util.Scanner;

// 중복 있이 비내림차순

public class N과M4 {
	static int n, m;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		dfs(1, 0);
		sc.close();
	}

	public static void dfs(int lo, int v) {
		if (v == m) {
			for (int answer : arr) {
				System.out.print(answer + " ");
			}
			System.out.println();
			return;
		}
		for (int i = lo; i <= n; i++) {
			arr[v] = i;
			dfs(i, v + 1);
		}
	}
}
