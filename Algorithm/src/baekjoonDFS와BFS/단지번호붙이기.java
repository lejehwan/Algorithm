package baekjoonDFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 단지번호붙이기 {
	static boolean[][] visited;
	static int[][] map;
	static int cnt = 0;
	// 행과 열의 4가지 방향을 확인 하기 위한 배열
	static int[] addRow = { -1, 1, 0, 0 };
	static int[] addCol = { 0, 0, -1, 1 };
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		for (int i = 0; i < map.length; i++) {
			String[] temp = br.readLine().split("");
			for (int j = 0; j < map.length; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
			}
		}
		visited = new boolean[n][n];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 1 && visited[i][j] == false) {
					cnt = 1;
					//dfs(i,j);
					bfs(i,j);
					list.add(cnt);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (Integer answer : list) {
			System.out.println(answer);
		}
	}
	
	public static int dfs(int i, int j) {
		visited[i][j] = true;
		// 상하좌우 4가지의 경우를 확인함
		for (int k = 0; k < 4; k++) {
			int ni = i + addRow[k];
			int nj = j + addCol[k];
			// map안에서 존재하며 방문 하지 않았다면 깊이우선탐색 진행
			if (ni >= 0 && ni < map.length && nj >= 0 && nj < map.length) {
				if (map[ni][nj] == 1 && visited[ni][nj] == false) {
					cnt++;
					dfs(ni,nj);
				}
			}
		}
		return cnt;
	}
	
	public static int bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {i,j});
		visited[i][j] = true;
		while (!queue.isEmpty()) {
			int a = queue.peek()[0];
			int b = queue.peek()[1];
			queue.poll();
			for (int k = 0; k < 4; k++) {
				// 상하좌우 4가지의 경우를 확인함
				int ni = a + addRow[k];
				int nj = b + addCol[k];
				// map 안에 존재하며 방분하지 않았다면 너비우선탐색 진행
				if (ni >= 0 && ni < map.length && nj >= 0 && nj < map.length) {
					if (map[ni][nj] == 1 && visited[ni][nj] == false) {
						queue.add(new int[] {ni,nj});
						visited[ni][nj] = true;
						cnt++;
					}
				}
			}
		}
		return cnt;
	}
}
