package baekjoon이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] check = new int[m];
		for (int i = 0; i < check.length; i++) {
			check[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < check.length; i++) {
			int start = 0;
			int mid = 0;
			int end = arr.length - 1;
			int flag = 0;
			while (end - start >= 0) {
				mid = (start + end) / 2;
				if (arr[mid] == check[i]) {
					flag = 1;
					break;
				} else if (arr[mid] < check[i]) {
					start = mid + 1;
				} else if (arr[mid] > check[i]) {
					end = mid - 1;
				}
			}
			System.out.println(flag);
		}
		sc.close();
	}
}

// 이분탐색 내장 함수 사용(Arrays.binarySearch)
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int m = sc.nextInt();
//		int[] check = new int[m];
//		for (int i = 0; i < check.length; i++) {
//			check[i] = sc.nextInt();
//		}
//		Arrays.sort(arr);
//		for (int i = 0; i < check.length; i++) {
//			int temp = 0;
//			temp = Arrays.binarySearch(arr,check[i]);
//			if (temp >= 0) {
//				System.out.println(1);
//			} else {
//				System.out.println(0);
//			}
//		}
//		sc.close();
//	}
//}


