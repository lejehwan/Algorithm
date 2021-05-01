package baekjoon브루트포스;

import java.util.Scanner;

public class 분해합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		boolean check = false;
		for (int i = 0; i < n; i++) {
			int sum = i;
			temp = i;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum == n) {
				System.out.println(i);
				check = true;
				break;
			}
		}
		if (!check) {
			System.out.println(0);
		}
		sc.close();
	}
}
