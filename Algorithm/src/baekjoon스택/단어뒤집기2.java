package baekjoon스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 단어뒤집기2 {

	static Stack<String> stack = new Stack<String>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		boolean check = false;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("<")) {
				append();
				sb.append("<");
				check = true;
			} else if (str[i].equals(">")) {
				sb.append(">");
				check = false;
				continue;
			} else if (check) {
				sb.append(str[i]);
				continue;
			} else if (str[i].equals(" ")) {
				append();
				sb.append(" ");
			} else {
				stack.add(str[i]);
			}
		}
		append();
		System.out.println(sb.toString());
	}
	
	public static void append() {
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
	}
}
