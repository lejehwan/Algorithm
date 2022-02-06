package baekjoon스택;

import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;

public class 후위표기식 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] ch = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<Character>();
		char c = 'a';
		for (char val : ch) {
			if (Character.isAlphabetic(val)) {
				sb.append(val);
			} else if (val == '(') {
				stack.push(val);
			} else if (val == ')') {
				while (!stack.empty()) {
					if ((c = stack.pop()) == '(') {
						break;
					}
					sb.append(c);
				}
			} else {
				while (!stack.empty() && priority(stack.peek()) >= priority(val)) {
					sb.append(stack.pop());
				}
				stack.push(val);
			}
		}
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());
	}

	public static int priority(char ch) {
		if (ch == '(') {
			return 0;
		} else if (ch == '+' || ch == '-') {
			return 1;
		}
		return 2;
	}
}
