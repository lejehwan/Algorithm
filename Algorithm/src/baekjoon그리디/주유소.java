package baekjoon그리디;

import java.util.Scanner;

// 수의 범위가 각각 10억 이하의 자연수 이므로 
// int -> long

public class 주유소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] road = new long[n-1];
		long[] price = new long[n];
		for (int i = 0; i < road.length; i++) {
			road[i] = sc.nextLong();
		}
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextLong();
		}
		long temp = price[0];
		long min = temp * road[0];
		for (int i = 1; i < road.length; i++) {
			if (price[i] < temp) {
				min += price[i] * road[i];
				temp = price[i];
			} else {
				min += road[i] * temp;
			}
		}
		System.out.println(min);
		sc.close();
	}
}
