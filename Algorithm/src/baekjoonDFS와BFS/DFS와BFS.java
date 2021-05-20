package baekjoonDFS와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS와BFS {
	static boolean visited[];
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 정점의 개수
		int m = sc.nextInt();// 간선의 개수
		int v = sc.nextInt();// 탐색을 시작할 정점의 번호
		map = new int[n+1][n+1];
		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 간선이 양방향이므로 a,b 와 b,a 둘다 1로 고정
			map[a][b] = 1;
			map[b][a] = 1;
		}
		visited = new boolean[n+1];
		dfs(v);
		System.out.println();
		visited = new boolean[n+1];
		bfs(v);
		sc.close();
	}
	// 재귀 이용
	public static void dfs(int v) {
		visited[v] = true;// 방문 처리
		System.out.print(v + " ");
		for (int i = 0; i < map.length; i++) {
			// 간선으로 연결된 다음 정점으로 갈 곳이 있고, 방문 하지 않았다면
			if (map[v][i] == 1 && visited[i] == false) {
				dfs(i);// 간선으로 연결된 다음 정점으로 이동
			}
		}
	}
	// 큐를 이용
	public static void bfs(int v) {
		// 방문한 정점의 인덱스를 넣어줄 큐 생성
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);// 큐에 시작위치 넣어줌
		visited[v] = true;// 방문 처리
		System.out.print(v + " ");
		// 큐가 비어있지 않을 때 까지
		while (!queue.isEmpty()) {
			int temp = queue.poll();// 다음 정점을 찾기위해 값을 옮겨주고 큐에서 삭제
			for (int i = 0; i < map.length; i++) {
				// 간선으로 연결된 다음 정점으로 갈 곳이 있고, 방문 하지 않았다면
				if (map[temp][i] == 1 && visited[i] == false) {
					queue.add(i);// 큐에 넣고
					visited[i] = true;// 방문 처리
					System.out.print(i + " ");
				}
			}
		}
	}
}
