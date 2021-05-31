package baekjoon스택;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (!stack.isEmpty() && temp == 0) {
				stack.pop();
			}else {
				stack.push(temp);
			}
		}
		for (Integer i : stack) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}
