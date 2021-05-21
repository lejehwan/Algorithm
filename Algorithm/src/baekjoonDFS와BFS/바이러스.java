package baekjoonDFS와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스 {
	static boolean[] visited;
	static int[][]map;
	static int cnt = -1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		map = new int[n+1][n+1];
		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}
		visited = new boolean[n+1];
		//dfs(1);
		bfs(1);
		System.out.println(cnt);
		sc.close();
	}
	
	public static void dfs(int v) {
		visited[v] = true;
		cnt++;
		for (int i = 0; i < map.length; i++) {
			if (map[v][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = true;
		cnt++;
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i = 0; i < map.length; i++) {
				if (map[temp][i] == 1 && visited[i] == false) {
					queue.add(i);
					visited[i] = true;
					cnt++;
				}
			}
		}
	}
}
