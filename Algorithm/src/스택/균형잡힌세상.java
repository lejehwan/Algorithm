package 스택;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		char temp;
		while (true) {
			String s = sc.nextLine();
			if (s.equals(".")) {
				break;
			}
			for (int i = 0; i < s.length(); i++) {
				temp = s.charAt(i);
				if (temp == '(' || temp == '[') {
					stack.push(temp);
				} else if (temp == ')' || temp == ']') {
					if (stack.isEmpty() || ((char) stack.peek() == '(' && temp == ']')
							|| ((char) stack.peek() == '[' && temp == ')')) {
						stack.push(temp);
						break;
					}
					stack.pop();
				}
			}
			String result = stack.isEmpty() ? "yes" : "no";
			System.out.println(result);
			stack.clear();
		}
		sc.close();
	}
}