package baekjoon큐덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stz = null;
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int bk = -1;
		for (int i = 0; i < n; i++) {
			stz = new StringTokenizer(br.readLine());
			String input = stz.nextToken();
			if (input.contains("push")) {
				bk = Integer.parseInt(stz.nextToken());
				queue.add(bk);
			} else if (input.equals("size")) {
				sb.append(queue.size() + "\n");
			} else if (input.equals("empty")) {
				sb.append((queue.isEmpty() ? 1 : 0) + "\n");
			} else if (input.equals("pop")) {
				sb.append((queue.size() == 0 ? -1 : queue.poll()) + "\n");
			} else if (input.equals("front")) {
				sb.append((queue.size() == 0 ? -1 : queue.peek()) + "\n");
			} else if (input.equals("back")) {
				sb.append((queue.size() == 0 ? -1 : bk) + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}