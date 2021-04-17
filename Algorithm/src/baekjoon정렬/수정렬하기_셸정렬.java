package baekjoon정렬;

import java.util.Scanner;

// 일반적인 시간 복잡도 : O(n^1.25)

public class 수정렬하기_셸정렬 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ShellSort = new int[n];
		for (int i = 0; i < n; i++) {
			ShellSort[i] = sc.nextInt();
		}
		shellSort(ShellSort);
		for (int result : ShellSort) {
			System.out.println(result);
		}
	}

	public static void shellSort(int[] arr) {
		int interval = arr.length / 2;
		while (interval >= 1) {
			for (int i = 0; i < interval; i++) {
				intervalSort(arr, i, arr.length - 1, interval);
			}
			interval /= 2;
		}

	}

	public static void intervalSort(int[] arr, int start, int end, int interval) {
		int j = 0;
		for (int i = start + interval; i <= end; i += interval) {
			int temp = arr[i];
			for (j = i - interval; j >= start && temp < arr[j]; j -= interval) {
				arr[j + interval] = arr[j];
			}
			arr[j + interval] = temp;
		}
	}

}
