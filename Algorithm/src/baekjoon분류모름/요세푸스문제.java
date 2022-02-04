package baekjoon분류모름;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 요세푸스문제 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("<");
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			queue.add(i+1);
		}
		int cnt = 1;
		while (queue.size() != 1) {
			if (cnt == m) {
				sb.append(queue.poll() + ", ");
				cnt = 1;
			}else {
				queue.add(queue.poll());
				cnt++;
			}
		}
		sb.append(queue.poll() + ">");
		System.out.println(sb.toString());
	}
}
