package baekjoon이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 나무자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] tree = new int[n];
		for (int i = 0; i < tree.length; i++) {
			tree[i] = sc.nextInt();
		}
		Arrays.sort(tree);
		int max = tree[tree.length - 1];
		int min = 1;
		while (max >= min) {
			int mid = (max + min) / 2;
			long sum = 0;
			for (int i = 0; i < tree.length; i++) {
				if (tree[i] - mid > 0) {
					sum += tree[i] - mid;
				}
			}
			if (sum >= h) {
				min = mid + 1;
			}else {
				max = mid - 1;
			}
		}
		System.out.println(max);
		sc.close();
	}
}
