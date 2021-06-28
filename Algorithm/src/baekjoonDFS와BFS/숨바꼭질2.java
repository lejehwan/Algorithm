package baekjoonDFS와BFS;

import java.util.*;
import java.io.*;

// 1. 이전 방문 시간이 현재 방문 시간 보다 빠를 때 => 큐에 삽입 X, 더 느리기 때문에
// 2. 이전 방문 시간이 현재 방문 시간 보다 느릴 때 => 큐에 삽입 상관 없음, 현재 방문 시간이 적어서 큐에 넣어야 하지만 사실 발생할 수 없는 경우(시간 순으로 방문 가능한 곳을 모두 탐색하기 때문)
// 3. 이전 방문 시간과 현재 방문 시간이 같을 때 => 큐에 삽입 O, 최소시간이 같을 수 있으므로

public class 숨바꼭질2 {
	static int n, k, cnt;
	static int[] visited = new int[100001];
	static int min = Integer.MAX_VALUE; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		if (n >= k) {
			System.out.println(n-k);
			System.out.println(1);
		} else {
			bfs(n);
			System.out.println(min);
			System.out.println(cnt);
		}
		sc.close();
	}

	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = 1;
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			// 최소 시간을 넘어가면 그 이후는 탐색 불필요
			if (min < visited[temp]) {
				return;
			}
			for (int i = 0; i < 3; i++) {
				int step;
				if (i == 0) {
					step = temp + 1;
				} else if (i == 1) {
					step = temp - 1;
				} else {
					step = temp * 2;
				}
				if (step == k) {
					min = visited[temp];
					cnt++;
				}
				// 서로 다른 경우로 같은 곳을 방문 할 수 있는 경우도 포함 해줘야 함(중복 방문 허용(3)) + (2)
				if ((step >= 0 && step < visited.length) && (visited[step] == 0 || visited[step] == visited[temp] + 1 || visited[step] >= visited[temp] + 1)) {
					queue.add(step);
					visited[step] = visited[temp] + 1;
				}
			}
		}
	}
}