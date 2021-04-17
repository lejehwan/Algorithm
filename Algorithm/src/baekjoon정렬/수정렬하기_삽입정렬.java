package baekjoon정렬;

import java.util.Scanner;

// 최선일 경우(순차정렬) : 
			// 전체 비교 횟수 : n-1
			// 전체 자리 이동 회수 : 0
			// 시간복잡도 : O(n)
// 최악일 경우(역순) :
			// 전체비교횟수 : n(n-1)/2
			// 전체 자리 이동 횟수 : n(n-1)/2
			// 시간복잡도 : O(n^2)


public class 수정렬하기_삽입정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] InsertSort = new int[n];
		for (int i = 0; i < InsertSort.length; i++) {
			InsertSort[i] = sc.nextInt();
		}
		for (int i = 0; i < InsertSort.length; i++) {
			int temp = InsertSort[i];
			int j = i;
			while (j > 0 && InsertSort[j-1] > temp) {
				InsertSort[j] = InsertSort[j-1];
				j -= 1;
			}
			InsertSort[j] = temp;
		}
		for (int answer : InsertSort) {
			System.out.println(answer);
		}
		sc.close();
	}
}
