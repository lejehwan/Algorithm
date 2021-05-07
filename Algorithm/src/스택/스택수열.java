package 스택;

import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		int[] pp = new int[n];
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i = 0; i < pp.length; i++) {
			pp[i] = sc.nextInt();
		}
		for (int i = 1; i <= pp.length; i++) {
			stack.push(i);
			sb.append("+" + "\n");
			while (!stack.isEmpty() && stack.peek() == pp[cnt]) {
				stack.pop();
				sb.append("-" + "\n");
				cnt++;
			}
		}
		if (stack.isEmpty()) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
