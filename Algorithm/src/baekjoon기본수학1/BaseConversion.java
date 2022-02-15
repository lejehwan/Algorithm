package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaseConversion {
	static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] conV = br.readLine().split(" ");
		int conA = Integer.parseInt(conV[0]);
		int conB = Integer.parseInt(conV[1]);
		int m = Integer.parseInt(br.readLine());
		int temp = conversionA(br.readLine().split(" "), conA);
		conversionB(temp, conB);
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static int conversionA(String[] temp, int conA) {
		int value = 0;
		for (int i = 0; i < temp.length; i++) {
			value += (int) Math.pow(conA, temp.length - 1 - i) * Integer.parseInt(temp[i]);
		}
		return value;
	}

	public static void conversionB(int temp, int conB) {
		while (temp != 0) {
			stack.add(temp % conB);
			temp /= conB;
		}
	}
}
