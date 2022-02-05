package baekjoon스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 에디터 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split("");
		int n = Integer.parseInt(br.readLine());
		Stack<String> stack1 = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		for (int i = 0; i < str.length; i++) {
			stack1.push(str[i]);
		}
		for (int i = 0; i < n; i++) {
			String[] command = br.readLine().split(" ");
			if (command[0].equals("P")) {
				stack1.push(command[1]);
			} else if (command[0].equals("B") && !stack1.empty()) {
				stack1.pop();
			} else if (command[0].equals("L") && !stack1.empty()) {
				stack2.push(stack1.pop());
			} else if (command[0].equals("D") && !stack2.empty()) {
				stack1.push(stack2.pop());
			}
		}
		while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		while (!stack2.empty()) {
			sb.append(stack2.pop());
		}
		System.out.println(sb.toString());
	}
}
