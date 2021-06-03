package baekjoon우선순위큐;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 절댓값힙 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int oo1 = Math.abs(o1);
				int oo2 = Math.abs(o2);
				if (oo1 == oo2) {
					if (o1 > o2) {
						return 1;// 자리 바꿈
					} else {
						return -1;// 자리 그대로
					}
				}
				return oo1 - oo2;
			}
		});
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (m == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(m);
			}
		}
		sc.close();
	}
}
