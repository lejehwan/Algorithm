package baekjoonDFS와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 나이트의이동 {
	static int[][] map;
	static boolean[][] visited;
	static int[] addRow = { -2, -2, 2, 2, -1, 1, -1, 1 };
	static int[] addCol = { 1, -1, 1, -1, 2, -2, -2, 2 };
	static int finishX;
	static int finishY;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();
			map = new int[n][n];
			visited = new boolean[n][n];
			int a = sc.nextInt();
			int b = sc.nextInt();
			finishX = sc.nextInt();
			finishY = sc.nextInt();
			bfs(a,b);
			System.out.println(map[finishX][finishY]);
		}
		sc.close();
	}
	
	public static void bfs(int x, int y) {
		if (finishX == x && finishY == y) {
			return;
		}
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {x,y});
		visited[x][y] = true;
		while (!queue.isEmpty()) {
			int nx = queue.peek()[0];
			int ny = queue.peek()[1];
			queue.poll();
			for (int i = 0; i < addCol.length; i++) {
				int ni = nx + addRow[i];
				int nj = ny + addCol[i];
				if (ni >= 0 && nj >= 0 && ni < map.length && nj < map.length && !visited[ni][nj]) {
					queue.add(new int[] {ni,nj});
					visited[ni][nj] = true;
					map[ni][nj] = map[nx][ny] + 1;
				}
			}
		}
	}
}
