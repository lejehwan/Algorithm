package baekjoon스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 오큰수 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			stack1.add(Integer.parseInt(input[i]));
		}
		stack2.add(stack1.pop());
		list.add(-1);
		while(!stack1.empty()) {
			if (stack2.empty()) {
				stack2.add(stack1.pop());
				list.add(-1);
			}else if (stack1.peek() < stack2.peek()) {
				list.add(stack2.peek());
				stack2.add(stack1.pop());
			}else {
				stack2.pop();
			}
		}
		Collections.reverse(list);
		for (Integer val : list) {
			sb.append(val + " ");
		}
		System.out.println(sb.toString().trim());
	}
}