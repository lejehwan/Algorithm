package 스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// scanner사용시 시간초과 => 입출력을 문자열로 받음(BfferedReader(),BufferedWriter())
// StringBuilder()도 무관

public class 스택 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int iInput = 0;
		String[] sInput;
		for (int i = 0; i < n; i++) {
			sInput = br.readLine().split(" ");
			if (sInput[0].equals("push")) {
				iInput = Integer.parseInt(sInput[1]);
				stack.push(iInput);
			} else if (sInput[0].equals("top")) {
				bw.write(String.valueOf(stack.empty() ? -1 : stack.peek()));
				bw.newLine();
			} else if (sInput[0].equals("size")) {
				bw.write(String.valueOf(stack.size()));
				bw.newLine();
			} else if (sInput[0].equals("empty")) {
				bw.write(String.valueOf(stack.empty() ? 1 : 0));
				bw.newLine();
			} else if (sInput[0].equals("pop")) {
				bw.write(String.valueOf(stack.empty() ? -1 : stack.pop()));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}

}