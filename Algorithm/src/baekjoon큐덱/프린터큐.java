package baekjoon큐덱;

import java.util.LinkedList;
import java.util.Scanner;

public class 프린터큐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int cnt = 0;
			LinkedList<int[]> queue = new LinkedList<int[]>();
			for (int j = 0; j < n; j++) {
				queue.add(new int[] {j, sc.nextInt()});// 큐에 인덱스 번호와 문서의 중요도를 배열로 넣음
			}
			while (!queue.isEmpty()) {
				int[] max = queue.poll();// 첫 번째 문서
				boolean check = true;// 중요도 판단 변수
				for (int j = 0; j < queue.size(); j++) {
					if (queue.get(j)[1] > max[1]) {
						check = false;
						queue.add(max);
						for (int k = 0; k < j; k++) {
							queue.add(queue.poll());
						}
						break;
					}
				}
				if (check) {
					cnt++;
					if (max[0] == m) {
						break;
					}
				} else {
					continue;
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
