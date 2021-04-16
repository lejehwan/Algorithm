package baekjoon정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 수정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sort = new int[n];
		for (int i = 0; i < n; i++) {
			sort[i] = sc.nextInt();
		}
		Arrays.sort(sort);
		for (int answer : sort) {
			System.out.println(answer);
		}
		sc.close();
	}
}
