package baekjoonDFS와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 유기농배추 {
	static int[][] map;
	static boolean[][] visited;
	static int cnt;
	static int[] addRow = { -1, 1, 0, 0 };
	static int[] addCol = { 0, 0, -1, 1 };
	static int m, n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int[] answer = new int[tc];
		for (int t = 0; t < tc; t++) {
			m = sc.nextInt();
			n = sc.nextInt();
			int k = sc.nextInt();
			map = new int[m][n];
			for (int i = 0; i < k; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[a][b] = 1;
			}
			visited = new boolean[m][n];
			cnt = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] == 1 && visited[i][j] == false) {
						// dfs(i,j);
						bfs(i, j);
						cnt++;
					}
				}
			}
			answer[t] = cnt;
		}
		for (int i : answer) {
			System.out.println(i);
		}
		sc.close();
	}

	public static void dfs(int i, int j) {
		visited[i][j] = true;
		for (int k = 0; k < 4; k++) {
			int ni = i + addRow[k];
			int nj = j + addCol[k];
			if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
				if (map[ni][nj] == 1 && visited[ni][nj] == false) {
					dfs(ni, nj);
				}
			}
		}
	}

	public static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] { i, j });
		visited[i][j] = true;
		while (!queue.isEmpty()) {
			int a = queue.peek()[0];
			int b = queue.peek()[1];
			queue.poll();
			for (int k = 0; k < 4; k++) {
				int ni = a + addRow[k];
				int nj = b + addCol[k];
				if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
					if (map[ni][nj] == 1 && visited[ni][nj] == false) {
						queue.add(new int[] {ni,nj});
						visited[ni][nj] = true;
					}
				}
			}
		}
	}
}
