package baekjoonClass_2_3;

import java.io.*;

public class 적록색약 {
	static String[][] map;
	static int[] addRow = { 0, 0, -1, 1 };
	static int[] addCol = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new String[n][n];
		for (int i = 0; i < map.length; i++) {
			String[] temp = br.readLine().split("");
			for (int j = 0; j < map.length; j++) {
				map[i][j] = temp[j];
			}
		}
		int[] check = new int[2];
		boolean[][][] visited = new boolean[2][n][n];
		for (int k = 0; k < 2; k++) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (!visited[k][i][j]) {
                        dfs(i, j, visited[k], map[i][j]);
                        check[k]++;
                    }
                    if (map[i][j].equals("G"))
                        map[i][j] = "R";
                }
            }
        }
		System.out.println(check[0] + " " + check[1]);
		br.close();
	}

	public static void dfs(int y, int x, boolean[][] visited, String color) {
		visited[y][x] = true;
		for (int i = 0; i < addRow.length; i++) {
			int nx = x + addRow[i];
			int ny = y + addCol[i];
			if (nx < 0 || nx >= map.length || ny < 0 || ny >= map.length || !map[ny][nx].equals(color) || visited[ny][nx]) {
				continue;
			}
			dfs(ny, nx, visited, color);
		}
	}
}