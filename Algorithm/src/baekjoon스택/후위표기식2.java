package baekjoon스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 후위표기식2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Double> stack = new Stack<Double>();
		char[] ch = br.readLine().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char key = 'A';

		for (int i = 0; i < n; i++) {
			map.put(key, Integer.parseInt(br.readLine()));
			key++;
		}
		for (char val : ch) {
			if (Character.isAlphabetic(val)) {
				stack.push(Double.valueOf(map.get(val)));
			} else {
				double temp = cal(stack.pop(), stack.pop(), val);
				stack.push(temp);
			}
		}
		System.out.format("%.2f", stack.pop());
	}

	public static double cal(Double a, Double b, Character c) {
		if (c == '+') {
			return b + a;
		} else if (c == '-') {
			return b - a;
		} else if (c == '*') {
			return b * a;
		} else {
			return b / a;
		}
	}
}
