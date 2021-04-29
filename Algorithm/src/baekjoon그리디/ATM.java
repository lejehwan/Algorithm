package baekjoon그리디;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] time = new int[n];
		for (int i = 0; i < time.length; i++) {
			time[i] = sc.nextInt();
		}
		Arrays.sort(time);
		int answer = 0;
		int temp = 0;
		for (int i = 0; i < time.length; i++) {
			temp += time[i];
			answer += temp;
		}
		System.out.println(answer);
		sc.close();
	}
}
