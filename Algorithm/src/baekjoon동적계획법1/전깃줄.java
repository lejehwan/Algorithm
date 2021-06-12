package baekjoon동적계획법1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 전체 전선의 개수 - 설치가 가능한 전선의 개수 = 제거할 전선의 개수

public class 전깃줄 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] line = new int[n][2];
		for (int i = 0; i < line.length; i++) {
			line[i][0] = sc.nextInt();
			line[i][1] = sc.nextInt();
		}
		// 오름차순 정렬
		Arrays.sort(line, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});
		// LIS와 같은 방식
		int[] dp = new int[n];
		for (int i = 0; i < line.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (line[i][1] > line[j][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		// 전체 - 설기 가능 개수  = 제거할 개수
		System.out.println(n - max);
		sc.close();
	}
}
