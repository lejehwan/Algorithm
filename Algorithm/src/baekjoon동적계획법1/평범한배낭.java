package baekjoon동적계획법1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//public class 평범한배낭 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		int[][] hw = new int[n][2];
//		for (int i = 0; i < hw.length; i++) {
//			hw[i][0] = sc.nextInt();
//			hw[i][1] = sc.nextInt();
//		}
//		Arrays.sort(hw, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// TODO Auto-generated method stub
//				if (o1[0] == o2[0]) {
//					return o2[1] - o1[1];
//				} else {
//					return o1[0] - o2[0];
//				}
//			}
//		});
////		System.out.println("배열 정렬");
////		for (int i = 0; i < hw.length; i++) {
////			System.out.println(hw[i][0] + " " + hw[i][1]);
////		}
////		System.out.println("각각의 해당 배열");
//		int[][] dp = new int[n][2];
//		for (int i = 0; i < hw.length; i++) {
//			dp[i][0] = hw[i][0];
//			dp[i][1] = hw[i][1];
//			for (int j = 0; j < i; j++) {
//				dp[i][0] = Math.max(dp[i][0], dp[j][0] + hw[i][0]);
//				if (dp[j][0] == hw[i][0]) {
//					continue;
//				}
//				if (dp[i][0] <= k) {
//					dp[i][1] = Math.max(dp[i][1], dp[j][1] + hw[i][1]);
//				} else {
//					dp[i][0] = hw[i][0];
//				}
//			}
////			System.out.println(dp[i][0] + " " + dp[i][1]);
//		}
//		int max = 0;
//		for (int i = 0; i < dp.length; i++) {
//			max = Math.max(max, dp[i][1]);
//		}
//		System.out.println(max);
//		sc.close();
//	}
//}

public class 평범한배낭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] dp = new int[n+1][k+1];
		int w[] = new int[n+1];
		int v[] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= k ; j++) {
				// 기본적으로 이전의 가치를 가진다.
				dp[i][j] = dp[i-1][j];
				// 만약 해당 무게를 뺐을 경우 잔여 무게가 있다면
				if (j - w[i] >= 0) {
					// 이전의 가치 vs 남은 무게의 차리 + 자신의 가치 중에서 큰 값을 저장
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
				}
			}
		}
		System.out.println(dp[n][k]);
		sc.close();
	}
}

