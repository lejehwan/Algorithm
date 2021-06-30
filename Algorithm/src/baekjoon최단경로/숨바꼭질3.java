package baekjoon최단경로;

import java.util.*;

// 최단경로 문제와 비슷하게 다익스트라 알고리즘 풀이 이므로 DFS와 BFS 카테고리 대신에 최단경로 카테고리에 넣음

class Node2 implements Comparable<Node2>{
	int x;
	int time;

	public Node2(int x, int time) {
		this.x = x;
		this.time = time;
	}

	@Override
	public int compareTo(Node2 o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.time, o.time);
	}

}

public class 숨바꼭질3 {
	static int n, k;
	static boolean[] visited = new boolean[100001];
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		if (n >= k) {
			System.out.println(n - k);
		} else {
			bfs();
			System.out.println(min);
		}
		sc.close();
	}

	public static void bfs() {
		PriorityQueue<Node2> pq = new PriorityQueue<Node2>();
		pq.add(new Node2(n, 0));
		while (!pq.isEmpty()) {
			Node2 tempNode = pq.poll();
			int temp = tempNode.x;
			visited[temp] = true;
			if (temp == k) {
				min = Math.min(min, tempNode.time);
			}
			if (temp * 2 < visited.length && !visited[temp * 2]) {
				pq.add(new Node2(temp * 2, tempNode.time));
			}
			if (temp + 1 < visited.length && !visited[temp + 1]) {
				pq.add(new Node2(temp + 1, tempNode.time + 1));
			}
			if (temp - 1 >= 0 && !visited[temp - 1]) {
				pq.add(new Node2(temp - 1, tempNode.time + 1));
			}
		}
	}
}
