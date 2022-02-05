package baekjoon스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<String>();
		String[] bar = br.readLine().split("");
		int answer = 0;
		for (int i = 0; i < bar.length; i++) {
			if (bar[i].equals("(")) {
				stack.add("(");
			}else if (bar[i].equals(")")) {
				stack.pop();
				if (bar[i-1].equals("(")) {
					answer += stack.size();
				}else {
					answer ++;
				}
			}
		}
		System.out.println(answer);
	}
}
