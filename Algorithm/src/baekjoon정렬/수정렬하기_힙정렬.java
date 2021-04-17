package baekjoon정렬;

import java.util.Scanner;

// 힙에 삭제 연산을 반복 수행하여 오름차순으로 정렬된 원소를 구하기 위해
// 삭제 연산을 수행 할 때 마다 힙을 재구성하는 연산이 필요하다
// 시간복잡도 => 힙의 재구성 시간
// n개의 노드에 대해 완전 이진트리는 log(n+1)렙을 가지므로
// 완전 이진 트리를 힙으로 구성하는 평균 시간은 logn이 된다
// 시간복잡도(힙의 평균 재구성 시간) : O(nlogn)

public class 수정렬하기_힙정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] HeapSort = new int[n];
		for (int i = 0; i < n; i++) {
			HeapSort[i] = sc.nextInt();
		}
		heapSort(HeapSort);
		for (int result : HeapSort) {
			System.out.println(result);
		}
	}
	// 최댓값을 배열의 부터 정렬(오름차순)
	public static void heapSort(int[] arr) {
		heapify(arr, arr.length);
		for (int i = arr.length - 1; i > 0; i--) {
			swap(arr, 0, i);// 루트노드오 마지막 노드를 바꾸어줌
			heapify(arr, i);// 마지막 노드를 제외하고 다시 힙구조로 변환
		}
	}
// 최대힙 구조로 변환하기 위한 메서드
	public static void heapify(int[] arr, int index) {
		for (int i = 1; i < index; i++) {// i == 0은 루트 노드이므로
			int child = i;
			while (child > 0) {
				int parent = (child - 1) / 2;
				if (arr[child] > arr[parent]) {
					swap(arr, child, parent);
				}
				child = parent;
			}
		}
	}
	// 자리 교환
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
