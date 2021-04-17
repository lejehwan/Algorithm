package baekjoon정렬;

import java.util.Scanner;

// 배열 arr[]를 2등분으로 분할하여 부분 배열을 만들고,각 부분배열에 대해
// 다시 호출하여 2등분으로 분할하는 작업을 한개가 될 때까지 반복.
// 정렬하고 병합하는 과정에서 새로 병합하여 만든 부분집합을 저장할 새로운 배열 sorted가 추가로 필요
// 2*n의 메모리 공간 사용
// n개의 원소를 두 부분으로 분할하기 위해 nlogn번 수행하고, 부분집합의 원소를 비교하면서 병합하는 단계에서
// 최대 n번의 비교연산을 수행하므로 시간복잡도 : O(nlogn)

public class 수정렬하기_병합정렬 {
	
	static int[] sorted;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] MergeSort = new int[n];
		for (int i = 0; i < MergeSort.length; i++) {
			MergeSort[i] = sc.nextInt();
		}
		sorted = new int[n];
		mergeSort(MergeSort, 0, MergeSort.length-1);
		for (int answer : MergeSort) {
			System.out.println(answer);
		}
		sc.close();
	}
	
	public static void mergeSort(int[] arr, int start, int end) {
		int mid;
		if (start < end) {
			mid = (start+end)/2;
			mergeSort(arr, start, mid);// 앞부분에 대한 분할 작업 수행
			mergeSort(arr, mid+1, end);// 뒷부분에 대한 분할 작업 수행
			merge(arr, start, mid, end);// 분할집합에 대하여 정렬과 병합작업 수행
		}
	}
	
	public static void merge(int[] arr, int start, int mid, int end) {
		int part1 = start;// 첫 번째 부분집합의 시작 위치 설정
		int part2 = mid+1;// 두 번째 부분집합의 시작 위치 설
		int index = start;// 배열 sorted에 정렬된 원소를 저장할 위치 설정
		
		// 두개의 부분집합에서 첫째 원소부터 하나씩 비교하여 순서대로 배열 sorted에 저장
		while (part1 <= mid && part2 <= end) {
			if (arr[part1] <= arr[part2]) {
				sorted[index] = arr[part1];
				part1++;
			}
			else {
				sorted[index] = arr[part2];
				part2++;
			}
			index++;
		}
		// 첫 번째 부분집합의 모든 원소를 sorted에 저장하고, 두 번째 부분집합들의 원소가 남아있을 때
		// 남아있는 원소들을 sorted에 저장
		if (part1 > mid) {
			for (int i = part2; i <= end; i++,index++) {
				sorted[index] = arr[i];
			}
		}
		// 두 번째 부분집합의 모든 원소를 sorted에 저장하고, 첫 번째 부분집합들의 원소가 남아있을 때
		// 남아있는 원소들을 sorted에 저장
		else {
			for (int i = part1; i <= mid; i++,index++) {
				sorted[index] = arr[i];
			}
		}
		// 정렬된 배열 sorted를 배열 arr로 복사
		for (int i = start; i <= end; i++) {
			arr[i] = sorted[i];
		}

	}
}
