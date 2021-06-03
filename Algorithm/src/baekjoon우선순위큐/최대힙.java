package baekjoon우선순위큐;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

// Collections.revereOrder() 사용시 시간 초과 => Comparator의 compare을 오버라이딩 하여 내림차순 정렬

public class 최대힙 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
//				return Integer.compare(o1, o2)*-1;
//				return o2-o1;
			}
		});
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (m == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
			}else {
				pq.add(m);
			}
		}
		sc.close();
	}
}
