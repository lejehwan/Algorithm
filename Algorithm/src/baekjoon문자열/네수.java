package baekjoon문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 네수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		long num1 = Long.parseLong((str[0] + str[1]));
		long num2 = Long.parseLong((str[2] + str[3]));
		System.out.println(num1 + num2);
	}
}
