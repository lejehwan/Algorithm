package baekjoon기본수학2;

import java.util.Scanner;

public class 소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		while (n != 1) {
			if (n % i == 0) {
				n /= i;
				System.out.println(i);
				i = 2;
			}else {
				i++;
			}
		}
		sc.close();
	}
}
