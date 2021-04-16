package baekjoon정렬;

import java.util.Scanner;

// 분할을 한번 할 때 나누는 값이 절반으로 줄어든 상태로 다시 절반을 나누기 때문에
// n만큼 나누는데 나눌때마다 데이터의 절반만큼 줄어들기 때문에
// 시간복잡도 : O(nlongn)
// 최악의 경우 :원소 한개와  나머지 n-1개로 나뉠때
// n*(n-1)
// 시간복잡도 : O(n^2)

public class 수정렬하기_퀵정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] QuickSort = new int[n];
		for (int i = 0; i < QuickSort.length; i++) {
			QuickSort[i] = sc.nextInt();
		}
		sort(QuickSort, 0, QuickSort.length - 1);
		for (int answer : QuickSort) {
			System.out.println(answer);
		}
		sc.close();
	}

	public static void sort(int[] arr, int start, int end) {
		int part = partition(arr, start, end);
		if (start < part - 1) {
			sort(arr, start, part - 1);
		}
		if (part < end) {
			sort(arr, part, end);
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];

		while (start <= end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		return start;
	}
}
