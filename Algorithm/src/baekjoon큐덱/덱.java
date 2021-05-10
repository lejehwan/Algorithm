package baekjoon큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = null;
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		String sInput = "";
		int iInput = 0;
		for (int i = 0; i < n; i++) {
			stz = new StringTokenizer(br.readLine());
			sInput = stz.nextToken();
			if (sInput.contains("push_front")) {
				iInput = Integer.parseInt(stz.nextToken());
				deque.addFirst(iInput);
			} else if (sInput.contains("push_back")) {
				iInput = Integer.parseInt(stz.nextToken());
				deque.addLast(iInput);
			} else if (sInput.equals("pop_front")) {
				sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append("\n");
			} else if (sInput.equals("pop_back")) {
				sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append("\n");
			} else if (sInput.equals("size")) {
				sb.append(deque.size()).append("\n");
			} else if (sInput.equals("empty")) {
				sb.append(deque.isEmpty() ? 1 : 0).append("\n");
			} else if (sInput.equals("front")) {
				sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
			} else if (sInput.equals("back")) {
				sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
			}
		}
		System.out.println(sb);
	}
}