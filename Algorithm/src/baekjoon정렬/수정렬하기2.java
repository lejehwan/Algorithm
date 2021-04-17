package baekjoon정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

// Arrays.sort() -> dual-pivot Quicksort 알고리즘을 사용
// 평균적으로 O(nlogn), 최악 O(n^2)
// Collections.sort() -> Timsort 알고리즘 사용(합병절렬과 삽입정렬의 최선의 경우를 섞음)
// 섞여있는 정렬 알고리즘 -> hybrid stable sorting algorithm
// 시간복잡도 : O(n) ~ O(nlogn)

public class 수정렬하기2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		for (Integer i : list) {
			bw.write(String.valueOf(i));
			bw.write("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
