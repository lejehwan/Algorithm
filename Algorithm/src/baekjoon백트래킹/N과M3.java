package baekjoon백트래킹;

import java.util.Scanner;

// 중복 있이 모든 경우

public class N과M3 {
	static int n, m;
	static int[] arr;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		dfs(0);
		System.out.println(sb.toString());
		sc.close();
	}

	public static void dfs(int v) {
		if (v == m) {
			for (int answer : arr) {
				sb.append(answer + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[v] = i;
			dfs(v + 1);
		}
	}
}
