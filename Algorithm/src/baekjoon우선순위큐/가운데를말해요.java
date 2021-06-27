package baekjoon우선순위큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 가운데를말해요 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>();// 오름차순
		PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>(new Comparator<Integer>() {// 내림차순

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 > o2 ? -1 : 1;
			}
		});
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				pqMax.add(Integer.parseInt(br.readLine()));
			}else {
				pqMin.add(Integer.parseInt(br.readLine()));
			}
			if (!pqMax.isEmpty() && !pqMin.isEmpty()) {
				if (pqMax.peek() > pqMin.peek()) {
					int temp = pqMin.poll();
					pqMin.add(pqMax.poll());
					pqMax.add(temp);
				}
			}
			sb.append(pqMax.peek() + "\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}