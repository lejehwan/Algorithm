package baekjoon이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 공유기설치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] gong = new int[n];
		for (int i = 0; i < gong.length; i++) {
			gong[i] = sc.nextInt();
		}
		Arrays.sort(gong);
		int left = 1;
		int right = gong[gong.length - 1] - gong[0];
		int dist = 0;
		int answer = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			int start = gong[0];
			int cnt = 1;
			// 간격 기준으로 공유기 설치
			for (int i = 1; i < gong.length; i++) {
				dist = gong[i] - start;
				// 만약 첫 번째 집과의 거리가 더 크면 cnt 증가시키고 찾는 집에 이번 집을 넣어줌
				if (mid <= dist) {
					cnt++;
					start = gong[i];
				}
			}
			// 공유기 수를 줄임 => 간격 넓힘
			// 공유기 수를 늘림 => 간격 줄임
			if (cnt >= c) {
				answer = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
