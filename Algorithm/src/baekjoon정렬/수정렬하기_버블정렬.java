package baekjoon정렬;

import java.util.Scanner;

// 메모리는 역시 n개 사용
// 이미 정렬 되어 있는 경우(최선) :
						// 전체 비교 횟수 : n(n-1)/2
						// 전체 자리 교환 횟수 : 0
						// 시간 복잡도 : O(n^2)
//이미 정렬 되어 있는 경우(최선) :
						// 전체 비교 횟수 : n(n-1)/2
						// 전체 자리 교환 횟수 : n(n-1)/2
						// 시간 복잡도 : O(n^2)

public class 수정렬하기_버블정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] BubbleSort = new int[n];
		for (int i = 0; i < BubbleSort.length; i++) {
			BubbleSort[i] = sc.nextInt();
		}
		for (int i = BubbleSort.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (BubbleSort[i] < BubbleSort[j]) {
					int temp = BubbleSort[i];
					BubbleSort[i] = BubbleSort[j];
					BubbleSort[j] = temp;
				}
			}
		}
		for (int answer : BubbleSort) {
			System.out.println(answer);
		}
		sc.close();
	}
}
