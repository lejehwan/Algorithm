package baekjoonDFS와BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 이분그래프 {
	static int[][] map;
	static int[] visited;// 방문하지 않았다면 0으로, 방문 했을 경우 서로 다른 색의 경우를 1,2로 함
	static ArrayList<Integer>[] list;
	static int n, m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			list = new ArrayList[n+1];
			visited = new int[n + 1];
			for (int j = 0; j <= n; j++) {
				list[j] = new ArrayList<Integer>();
			}
			for (int j = 0; j < m; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				list[a].add(b);
				list[b].add(a);
			}
			bfs();
		}
		sc.close();
	}

	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (visited[i] == 0) {// 방문하지 않았다면
				queue.add(i);// 큐에 넣고
				visited[i] = 1;// 방문처리
			}
			while (!queue.isEmpty()) {
				int temp = queue.poll();
				for (int j = 0; j < list[temp].size(); j++) {
					if (visited[list[temp].get(j)] == 0) { // 연결 정점이 방문 하지 않았다면
						queue.add(list[temp].get(j));// 큐에 삽입
					}
					if (visited[list[temp].get(j)] == visited[temp]) {// 연결 정점과 현재 정점이 같다면
						System.out.println("NO");// 이분 그래프가 아님
						return;
					}
					if (visited[temp] == 1 && visited[list[temp].get(j)] == 0) {// 현재 정점이 1이고 연결 정점은 방분하지 않았다면
						visited[list[temp].get(j)] = 2;// 연결 정점은 2로 저장
					}else if (visited[temp] == 2 && visited[list[temp].get(j)] == 0) {// 현재 정점이 2이고 연결 정점은 방문하지 않았다면
						visited[list[temp].get(j)] = 1;// 연결 정점은 1로 저장
					}
				}
			}
		}
		System.out.println("YES");
		return;
	}
}
