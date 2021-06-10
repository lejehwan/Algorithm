package baekjoon스택;

import java.util.Scanner;
import java.util.Stack;

public class 오큰수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		int[] seq = new int[n];
		for (int i = 0; i < n; i++) {
			seq[i] = sc.nextInt();
		}
		for (int i = 0; i < seq.length; i++) {
			// 스택이 비어있지 않고, 현재원소(seq[i]) 스택의 맨 위가 가리키는 값보다 큰 경우
			while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
				// 스택의 맨 위가 가리키는 값을 지우고 현재원소(seq[i])에 넣음
				seq[stack.pop()] = seq[i];
			}
			// 위 조건에 부합하지 않다면 스택에 해당 인덱스 삽입
			stack.push(i);
		}
		// 마지막에 스택에 값이 남아있으면
		while (!stack.isEmpty()) {
			// 스택의 값이 가리키는 seq배열의 값을 -1로 변경
			seq[stack.pop()] = -1;
		}
		// 각각을 출력하면 시간초과 => 한번에 출력
		StringBuilder sb = new StringBuilder();
		for (int answer : seq) {
			sb.append(answer + " ");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
