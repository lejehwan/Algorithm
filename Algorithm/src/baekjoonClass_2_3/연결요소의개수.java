package baekjoonClass_2_3;
import java.util.Scanner;

public class 연결요소의개수 {
	static int[][] map;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		map = new int[n+1][n+1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 7;
			map[b][a] = 7;
		}
		visited = new boolean[n+1];
		int cnt = 0;
		for (int i = 1; i < map.length; i++) {
			if (!visited[i]) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
	
	public static void dfs(int v) {
		visited[v] = true;
		for (int i = 1; i < map.length; i++) {
			if (!visited[i] && map[v][i] == 7) {
				dfs(i);
			}
		}
	}
}