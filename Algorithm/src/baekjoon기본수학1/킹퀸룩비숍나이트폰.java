package baekjoon기본수학1;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] chess = { 1, 1, 2, 2, 2, 8 };
		int[] input = new int[chess.length];
		for (int i = 0; i < chess.length; i++) {
			input[i] = sc.nextInt();
			sb.append(chess[i] - input[i] + " ");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
