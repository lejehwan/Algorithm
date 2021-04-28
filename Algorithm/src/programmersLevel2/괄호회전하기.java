package programmersLevel2;

import java.util.Stack;

public class 괄호회전하기 {

}

class 괄호회전하기Solution {
    public int solution(String s) {
    	int answer = 0;
        int small = 0;
        int middle = 0;
        int large = 0;
        boolean check = false;
        Stack<String> stack = new Stack<String>();
        
        for (int j = 0; j < s.length(); j++) {
			String first = s.substring(0,1);
			String last = s.substring(1);
			s = last+first;
			stack.clear();
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '{') {
					large ++;
					stack.push("{");
					check = true;
				} else if (s.charAt(i) == '}') {
					large--;
					if (large >= 0) {
						if (stack.peek().equals("{")) {
							stack.pop();
						}
					}
				} else if (s.charAt(i) == '[') {
					middle ++;
					stack.push("[");
					check = true;
				} else if (s.charAt(i) == ']') {
					middle --;
					if (middle >= 0) {
						if (stack.peek().equals("[")) {
							stack.pop();
						}
					}
				} else if (s.charAt(i) == '(') {
					small ++;
					stack.push("(");
					check = true;
				} else if (s.charAt(i) == ')') {
					small --;
					if (small >= 0) {
						if (stack.peek().equals("(")) {
							stack.pop();
						}
					}
				}
			}
			if (stack.isEmpty() && check) {
				answer ++;
			}
		}
        return answer;
    }
}