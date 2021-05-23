package baekjoonDFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 이동 경로 상의 숫자를 더해줌으로써 마지막에 도착시 해당 숫자까지 더해줌으로써 그 값을 출력하여 최솟값을 구함

public class 미로탐색 {
	static int[][] map;
	static boolean[][] visited;
	static int[] addRow = { -1, 1, 0, 0 };
	static int[] addCol = { 0, 0, -1, 1 };
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tc = br.readLine().split(" ");
		n = Integer.parseInt(tc[0]);
		m = Integer.parseInt(tc[1]);
		map = new int[n][m];
		for (int i = 0; i < map.length; i++) {
			String[] temp = br.readLine().split("");
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
			}
		}
		visited = new boolean[n][m];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == 1 && visited[i][j] == false) {
					bfs(i, j);
				}
			}
		}
		// 마지막 위치까지의 경로상의 숫자 합
		System.out.println(map[n-1][m-1]);
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
				if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
					if (map[ni][nj] == 1 && visited[ni][nj] == false) {
						queue.add(new int[] { ni, nj });
						visited[ni][nj] = true;
						// 이동 경로상의 숫자를 더해줌
						// map[a][b] 는 상하좌우로 이동하기 전의 값
						// map[ni][nj]는 map[a][b]에서 상하좌우로 이동한 값
						// 이므로 이동된 값은 전 값의 + 1을 해줌으로써 이동 경로상의 최솟값을 구함
						map[ni][nj] = map[a][b]+1;
					}
				}
			}
		}
	}
}
