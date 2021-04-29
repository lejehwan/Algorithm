package baekjoon그리디;

import java.util.Scanner;

public class 잃어버린괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split("-");
		int min = 0;
		// "-" 가 나오기 전(합)
		min += sum(str[0].split("[+]"));
		// "-" 가 나온 후(차)
		for (int i = 1; i < str.length; i++) { 
			min -= sum(str[i].split("[+]"));
		}
		System.out.println(min);
		sc.close();
	}
	static int sum(String[] n) {
		int result = 0;
		for (int i = 0; i < n.length; i++) {
			int k = Integer.parseInt(n[i]);
			result += k;
		}
		return result;
	}
}
