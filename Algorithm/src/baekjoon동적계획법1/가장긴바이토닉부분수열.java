package baekjoon동적계획법1;

import java.util.Scanner;

public class 가장긴바이토닉부분수열 {
	static int[] dpIn;
	static int[] dpDe;
	static int[] input;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		input = new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		dpIn = new int[n];
		dpDe = new int[n];
		increase();
		decrease();
		int max = 0;
		for (int i = 0; i < dpIn.length; i++) {
			max = Math.max(dpIn[i] + dpDe[i], max);
		}
		// 가장 높은 곳에서 중복 되므로 중복 제거(-1)
		System.out.println(max-1);
		sc.close();
	}
	// 증가
	public static void increase() {
		for (int i = 0; i < dpIn.length; i++) {
			dpIn[i] = 1;
			for (int j = 0; j < dpIn.length; j++) {
				if (input[i] > input[j]) {
					dpIn[i] = Math.max(dpIn[i], dpIn[j]+1);
				}
			}
		}
	}
	// 감소
	public static void decrease() {
		for (int i = dpDe.length-1; i >= 0; i--) {
			dpDe[i] = 1;
			for (int j = dpDe.length-1; j > i; j--) {
				if (input[i] > input[j]) {
					dpDe[i] = Math.max(dpDe[i], dpDe[j]+1);
				}
			}
		}
	}
}
