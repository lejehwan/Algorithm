package baekjoonDFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 벽부수고이동하기 {
	static int n, m;
	static int[][] map;
	static int[][] visited;// 방문 여부 + 벽을 부순 횟수
	static int[] addRow = { -1, 1, 0, 0 };
	static int[] addCol = { 0, 0, -1, 1 };
	static int drill;// 공사 횟수
	static int dis;// 거리

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());
		n = Integer.parseInt(stz.nextToken());
		m = Integer.parseInt(stz.nextToken());
		map = new int[n][m];
		visited = new int[n][m];
		for (int i = 0; i < n; i++) {
			String[] temp = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		System.out.println(bfs(0, 0));
		br.close();
	}

	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] { x, y, 1, 0 });// x, y, dis, drill => 시작 거리를 1로 시작함
		visited[y][x] = 0;
		while (!queue.isEmpty()) {
			int a = queue.peek()[0];
			int b = queue.peek()[1];
			dis = queue.peek()[2];
			drill = queue.peek()[3];
			queue.poll();
			if (m - 1 == a && n - 1 == b) {
				return dis;
			}
			for (int i = 0; i < addCol.length; i++) {
				int ni = a + addRow[i];
				int nj = b + addCol[i];
				if (nj >= 0 && ni >= 0 && ni < m && nj < n) {
					// 벽을 부수고 온 것과 벽을 안부수고 온 것으로 나눌 때
					// 안 부수고 온쪽을 기준으로 한다.
					// 안 부숨  => visited[nj][ni] == 0, 벽을 부수고 온쪽은 탐색 할 필요가 없음
					// 부숨 => visited[nj][ni] == 1, 벽을 안부수고 온쪽에서 새로 탐색
					if (visited[nj][ni] > drill) {
						if (map[nj][ni] == 0) {// 벽이 아닐 때
							queue.add(new int[] { ni, nj, dis + 1, drill });
							visited[nj][ni] = drill;
						} else {
							if (drill == 0) {// 벽이면서 벽을 부순 횟수가 0일 때
								queue.add(new int[] { ni, nj, dis + 1, drill + 1 });
								visited[nj][ni] = drill + 1;
							}
						}
					}
				}
			}
		}
		return -1;
	}
}

//public class 벽부수고이동하기 {
//	static int[][] map;
//	static int[][] visited;
//	static int[] addRow = { 1, -1, 0, 0 };
//	static int[] addCol = { 0, 0, 1, -1 };
//	static int n, m;
//
//	static class Point {
//		int x, y, dis, drill;
//
//		public Point(int x, int y, int dis, int drill) {
//			this.x = x;
//			this.y = y;
//			this.dis = dis;
//			this.drill = drill;
//		}
//	}
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer stz = new StringTokenizer(br.readLine());
//		n = Integer.parseInt(stz.nextToken());
//		m = Integer.parseInt(stz.nextToken());
//		map = new int[n][m];
//		visited = new int[n][m];
//		for (int i = 0; i < n; i++) {
//			String[] temp = br.readLine().split("");
//			for (int j = 0; j < m; j++) {
//				map[i][j] = Integer.parseInt(temp[j]);
//				visited[i][j] = Integer.MAX_VALUE;
//			}
//		}
//		System.out.println(bfs(0, 0));
//		br.close();
//	}
//
//	public static int bfs(int x, int y) {
//		Queue<Point> queue = new LinkedList<Point>();
//		queue.add(new Point(x, y, 1, 0));
//		visited[y][x] = 0;
//		while (!queue.isEmpty()) {
//			Point point = queue.poll();
//			if (n - 1 == point.y && m - 1 == point.x) {
//				return point.dis;
//			}
//			for (int i = 0; i < addCol.length; i++) {
//				int ni = point.x + addRow[i];
//				int nj = point.y + addCol[i];
//				if (ni >= 0 && nj >= 0 && ni < m && nj < n) {
//					if (visited[nj][ni] > point.drill) {
//						if (map[nj][ni] == 0) {
//							queue.add(new Point(ni, nj, point.dis + 1, point.drill));
//							visited[nj][ni] = point.drill;
//						} else {
//							if (point.drill == 0) {
//								queue.add(new Point(ni, nj, point.dis + 1, point.drill + 1));
//								visited[nj][ni] = point.drill + 1;
//							}
//						}
//					}
//				}
//			}
//		}
//		return -1;
//	}
//}
