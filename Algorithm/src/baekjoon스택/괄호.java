package baekjoon스택;

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String pth = sc.next();
			boolean check = true;
			stack.clear();
			for (int j = 0; j < pth.length(); j++) {
				if (pth.charAt(j) == '(') {
					stack.push("(");
				} else if (pth.charAt(j) == ')') {
					if (stack.isEmpty()) {
						sb.append("NO").append("\n");
						check = false;
						break;
					} else {
						stack.pop();
					}
				}
			}
			if (check) {
				if (stack.isEmpty()) {
					sb.append("YES").append("\n");
				} else {
					sb.append("NO").append("\n");
				}
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
