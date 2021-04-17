package baekjoon정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 카운팅 정렬 : 인덱스를 통해 위치를 찾아 데이터의 값이 몇 번 나왔는지 세주는 것
// 시간복잡도 : O(n)
// 하지만 데이터의 범위가 극단적일수록 메모리의 낭비가 심해짐

public class 수정렬하기3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] cnt = new int[10001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			while (cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		System.out.println(sb);
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		Arrays.sort(arr);
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < arr.length; i++) {
//			sb.append(arr[i]).append("\n");
//		}
//		System.out.println(sb);
	}
}
