package baekjoon백트래킹;

import java.util.Scanner;

// 나의 풀이 : 재귀 전의 값을 새로운 전역변수 k에 저장시킨 후 재귀 호출 후의 값을 비교하여 크거나 같을 경우만 실행 후 재귀가 끝난 후 0으로 초기화
// 탐색 하기 전에 크기를 판별하여 전 수보다 작으면 탐색 안함

// 즉 나의 풀이는 판별을 하는 불필요한 과정을 거치지만 다른 풀이는 애초에 그 과정을 배제시킴

//public class N과M2 {
//	static int n,m, k;
//	static int[] arr;
//	static boolean[] visited;
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		m = sc.nextInt();
//		arr = new int[m];
//		visited = new boolean[n];
//		dfs(0);
//		sc.close();
//	}
//	
//	public static void dfs(int v) {
//		if (v == m) {	
//			for (int answer : arr) {
//				System.out.print(answer + " ");
//			}
//			System.out.println();
//			return;
//		}
//		for (int i = 0; i < n; i++) {
//			if (k <= i) {
//				if (!visited[i]) {
//					visited[i] = true;
//					arr[v] = i+1;
//					k = i+1;
//					dfs(v+1);
//					visited[i] = false;
//					k = 0;
//				}
//			}
//			
//		}
//	}
//}

// 다른 풀이 : 현재 위치의 변수 lo를 만들어 1로 초기화 시켜준뒤 반복문의 시작을 lo로 하고 재귀호출을 할 때 lo+1로써 호출을 함으로 전보다 큰 수로 재귀호출이 가능하다
// 탐색 안할 것을 재귀호출로 넘어감

public class N과M2 {
	static int n, m;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		visited = new boolean[n];
		dfs(1, 0);
		sc.close();
	}

	public static void dfs(int lo, int v) {
		if (v == m) {
			for (int answer : arr) {
				System.out.print(answer + " ");
			}
			System.out.println();
			return;
		}
		for (int i = lo; i <= n; i++) {
			arr[v] = i;
			// 현재 i값 보다 다음 재귀에서 커야 하므로 i+1의 값을 넘겨주고 깊이(v) 또한 1 증가 시켜줌
			dfs(i + 1, v + 1);
		}
	}
}
