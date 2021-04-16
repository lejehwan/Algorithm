package baekjoon정렬;

import java.util.Scanner;

// 원소 n개에 대한 선택 정렬은 메모리 역시 n개를 사용 -> 공간복잡도 : n
// 비교 횟수를 구해보면 
	// 첫째 값을 기준으로 n번 비교
	// 두번째 값을 기준으로 n-1번 비교 ...
	// 등차수열의 합 : n(n-1)/2 -> 시간복잡도 : O(n^2)

public class 수정렬하기_선택정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] SelectionSort = new int[n];
		for (int i = 0; i < SelectionSort.length; i++) {
			SelectionSort[i] = sc.nextInt();
		}
		for (int i = 0; i < SelectionSort.length-1; i++) {
			for (int j = i+1; j < SelectionSort.length; j++) {
				if (SelectionSort[i] > SelectionSort[j]) {
					int temp = SelectionSort[i];
					SelectionSort[i] = SelectionSort[j];
					SelectionSort[j] = temp;
				}
			}
		}
		for (int answer : SelectionSort) {
			System.out.println(answer);
		}
		sc.close();
	}
}
