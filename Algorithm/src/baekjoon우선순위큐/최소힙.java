package baekjoon우선순위큐;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 최소힙 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int n = sc.nextInt();
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
