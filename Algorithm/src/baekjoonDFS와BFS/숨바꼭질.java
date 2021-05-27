package baekjoonDFS와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질 {
	static int n, k;
	static int[] visited = new int[100001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		if (n == k) {
			System.out.println(0);
		}else {
			bfs(n);
		}
		sc.close();
	}

	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = 1;
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i = 0; i < 3; i++) {
				int step;
				if (i == 0) {
					step = temp + 1;
				} else if (i == 1) {
					step = temp - 1;
				} else {
					step = temp * 2;
				}
				if (step == k) {
					System.out.println(visited[temp]);
					return;
				}
				if (step >= 0 && step < visited.length && visited[step] == 0) {
					queue.add(step);
					visited[step] = visited[temp] + 1;
				}
			}
		}
	}
}
