package baekjoon백트래킹;

import java.util.Scanner;

public class N_Queen {
	// board의 인덱스를 열, 인덱스에 해당하는 값을 행으로 봄
	static int[] board;
	static int n;
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board = new int[n];
		dfs(0);
		System.out.println(cnt);
		sc.close();
	}
	
	public static void dfs(int v) {
		// 8개가 되었으면 경우의 수 1가지 증가
		if (v == n) {
			cnt ++;
			return;
		}
		for (int i = 0; i < board.length; i++) {
			// Queen의 위치(board[열] = 행)
			board[v] = i;
			// Queen을 놓을 수 있다면 다음 열로 재귀 호출
			if (check(v)) {
				dfs(v+1);
			}
		}
	}
	
	public static boolean check(int y) {
		for (int i = 0; i < y; i++) {
			// 같은 행에 있을 경우
			if (board[y] == board[i]) {
				return false;
			}
			// 대각선상에 위치한 경우(왼쪽/오른쪽 2가지(-/+) 이므로 절댓값 또는 제곱으로 판별함)
			else if (Math.pow(y-i, 2) == Math.pow(board[y]-board[i], 2)) {
				return false;
			}
		}
		return true;
	}
}
