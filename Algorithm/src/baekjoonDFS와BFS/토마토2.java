package baekjoonDFS와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토2 {
	static int[][][] map;
	static int[] addRow = { 1, -1, 0, 0, 0, 0 };
	static int[] addCol = { 0, 0, 1, -1, 0, 0 };
	static int[] addFac = { 0, 0, 0, 0, 1, -1 };
	static int n, m, h;
	static int max = 0;
	static Queue<int[]> queue = new LinkedList<int[]>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		h = sc.nextInt();
		map = new int[h][n][m];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					map[i][j][k] = sc.nextInt();
					if (map[i][j][k] == 1) {
						queue.add(new int[] { i, j, k });
					}
				}
			}
		}
		bfs(queue);
		if (!check()) {
			System.out.println(-1);
		} else if (max == 0) {
			System.out.println(0);
		} else {
			System.out.println(max - 1);
		}
		sc.close();
	}

	public static void bfs(Queue<int[]> queue) {
		while (!queue.isEmpty()) {
			int c = queue.peek()[0];
			int a = queue.peek()[1];
			int b = queue.peek()[2];
			queue.poll();
			for (int i = 0; i < 6; i++) {
				int nh = c + addFac[i];
				int ni = a + addRow[i];
				int nj = b + addCol[i];
				if (ni >= 0 && ni < n && nj >= 0 && nj < m && nh >= 0 && nh < h) {
					if (map[nh][ni][nj] == 0) {
						map[nh][ni][nj] = map[c][a][b] + 1;
						queue.add(new int[] { nh, ni, nj });
						if (map[nh][ni][nj] > max) {
							max = map[nh][ni][nj];
						}
					}
				}
			}
		}
	}

	public static boolean check() {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (map[i][j][k] == 0) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
