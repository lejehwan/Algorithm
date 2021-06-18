package baekjoon이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 가장긴증가하는부분수열2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		// 새로운 배열 dp, 인덱스의 위치 cnt를 만듬
		int[] dp = new int[n];
		int cnt = 1;
		// 시작 값
		dp[0] = input[0];
		for (int i = 1; i < dp.length; i++) {
			// input배열의 전값(dp[cnt-1])보다 현재 input[]의 값이 크다면
			if (input[i] > dp[cnt - 1]) {
				dp[cnt] = input[i];
				cnt++;
				// 시작 값 보다 작으면 변경
			} else if (dp[0] > input[i]) {
				dp[0] = input[i];
			} else {
				// 찾을 배열, 시작 인덱스, 끝 인덱스, 키값
				int temp = Arrays.binarySearch(dp, 0, cnt, input[i]);
				// 이진 검색시 찾지 못햇을 경우 temp에는 -(시작값 + 1)의 값이 반환 됨
				// 당연히 찾을 경우에는 검색 범위에 있는(시작과 끝) 사이에 있는 값이 반환 됨
				if (temp < 0) {
					dp[-(temp + 1)] = input[i];
				} else {
					dp[temp] = input[i];
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}