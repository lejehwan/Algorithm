package baekjoon이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드2 {
	public static int[] card;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		card = new int[n];
		for (int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] check = new int[m];
		for (int i = 0; i < check.length; i++) {
			check[i] = sc.nextInt();
		}
		Arrays.sort(card);
		for (int i = 0; i < check.length; i++) {
			int low = lower(check[i]);
			int high = upper(check[i]);
			sb.append(high - low + " ");
		}
		System.out.println(sb.toString());
		sc.close();
	}
	// 찾는 값의 왼쪽 부분
	public static int lower(int x) {
		int start = 0;
		int end = card.length;
		while (start < end) {
			int mid = (start + end) / 2;
			if (card[mid] >= x) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
	// 찾는 값의 오른쪽 부분
	public static int upper(int x) {
		int start = 0;
		int end = card.length;
		while (start < end) {
			int mid = (start + end) / 2;
			if (card[mid] <= x) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}
}
