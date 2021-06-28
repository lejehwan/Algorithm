package baekjoon최단경로;

import java.util.*;

class Node implements Comparable<Node> {
	int endV;
	int weight;

	public Node(int endV, int weight) {
		this.endV = endV;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		// 자기 자신과 매개변수 객체를 비교
		// this.dis - o.dis => 오름차순
		return Integer.compare(this.weight, o.weight);
	}

}

public class 최단경로 {
	static int V, E, K;
	static ArrayList<Node>[] list;
	static int[] dis;
	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		K = sc.nextInt();
		list = new ArrayList[V + 1];
		for (int i = 1; i < list.length; i++) {
			list[i] = new ArrayList<Node>();
		}
		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			list[u].add(new Node(v, w));
		}
		dis = new int[V + 1];
		Arrays.fill(dis, INF);
		dijkstra(K);
		for (int i = 1; i < list.length; i++) {
			if (dis[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(dis[i]);
			}
		}
		sc.close();
	}

	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		boolean[] check = new boolean[V + 1];
		pq.add(new Node(start, 0));
		dis[start] = 0;
		while (!pq.isEmpty()) {
			Node tempNode = pq.poll();
			int temp = tempNode.endV;
			// 이미 방문 했다면 패스
			if (check[temp]) {
				continue;
			}
			for (Node node : list[temp]) {
				// 연결된 정점의 가중치가 (현재 정점의 가중치 + 현재 간선의 가중치) 보다 크면 변경
				if (dis[node.endV] > dis[temp] + node.weight) {
					dis[node.endV] = dis[temp] + node.weight;
					pq.add(new Node(node.endV, dis[node.endV]));
				}
			}
			check[temp] = true;
		}
	}
}
