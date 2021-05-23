package baekjoonDFS와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
	static int[][] map;
	static int[] addRow = { -1, 1, 0, 0 };
	static int[] addCol = { 0, 0, -1, 1 };
	static int n, m;
	static int max = 0;
	static Queue<int[]> queue = new LinkedList<int[]>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[n][m];	
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = sc.nextInt();
				// map[i][j]에서 1인 지점을 모두 큐에 삽입
				if (map[i][j] == 1) {
					queue.add(new int[] { i, j });
				}
			}
		}
		bfs(queue);
		
		if (!check()) {// 토마토가 모두 익을 수 없음
			System.out.println(-1);
		} else if (max == 0) {// 토마토가 모두 익어잇음
			System.out.println(0);
		} else {// 시작 지점을 빼줘야 함
			System.out.println(max - 1);
		}
		sc.close();
	}

	public static void bfs(Queue<int[]> queue) {
		while (!queue.isEmpty()) {
			int a = queue.peek()[0];
			int b = queue.peek()[1];
			queue.poll();
			for (int i = 0; i < 4; i++) {
				int ni = a + addRow[i];
				int nj = b + addCol[i];
				if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
					// map에서 상하좌우중 0이 있다면 그 위치를 큐에 넣고 해당 위치의 값을 상하좌우전의 값 + 1을 해줌
					if (map[ni][nj] == 0) {
						queue.add(new int[] { ni, nj });
						map[ni][nj] = map[a][b] + 1;
						// map 전체가 익은 토마토가 아니고  max값 보다 크면 max값 수정
						// map 전체가 익은 토마토라면 아래 조건문은 수행하지 않으므로 main문에서 0출력
						if (map[ni][nj] > max) {
							max = map[ni][nj];
						}
					}
				}
			}
		}
	}

	public static boolean check() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
