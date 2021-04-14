package programmersLevel2;

import java.util.Stack;

public class 올바른괄호 {

}

class 올바른괄호Solution1 {
	public boolean solution(String s) {
		boolean answer = true;
		int check = 0;
		for (int i = 0; i < s.length(); i++) {
			if (check == 0 && s.charAt(i) == ')') {
				return false;
			}
			if (s.charAt(i) == '(') {
				check++;
			} else if (s.charAt(i) == ')') {
				check--;
			}
		}
		if (check != 0) {
			answer = false;
		}
		return answer;
	}
}

// 스택이용
class 올바른괄호Solution2 {
	public boolean solution(String s) {
		boolean answer = true;
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty() && s.charAt(i) == ')') {
				return false;
			}
			if (s.charAt(i) == '(') {
				stack.push("(");
			} else if (s.charAt(i) == ')') {
				stack.pop();
			}
		}
		if (!stack.isEmpty()) {
			answer = false;
		}
		return answer;
	}
}
