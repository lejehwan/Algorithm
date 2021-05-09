package baekjoon큐덱;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		while (queue.size() != 0) {
			for (int i = 0; i < k - 1; i++) {
				queue.add(queue.poll());
			}
			sb.append(queue.peek() + ", ");
			queue.poll();
		}
		sb.append(">");
		sb.delete(sb.length()-3, sb.length()-1);
		System.out.println(sb.toString());
		sc.close();
	}
}

//// 선형 큐를 원형 큐로 변형 시킨 풀이
//public class 요세푸스문제0 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt()-1;
//		int idx = k;
//		StringBuilder sb = new StringBuilder();
//		sb.append("<");
//		LinkedList<Integer> queue = new LinkedList<Integer>();
//		for (int i = 1; i <= n; i++) {
//			queue.add(i);
//		}
//		while (queue.size() != 1) {
//			sb.append(queue.get(idx).toString() + ", ");
//			queue.remove(idx);
//			idx = (idx + k)%queue.size();//선형 큐를 원형 큐로 만든다
//		}
//		sb.append(queue.pop().toString() + ">");
//		System.out.print(sb);
//	}
//}