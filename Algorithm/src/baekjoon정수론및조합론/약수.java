package baekjoon정수론및조합론;

import java.util.Arrays;
import java.util.Scanner;

public class 약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] divisor = new int[n];
		for (int i = 0; i < divisor.length; i++) {
			divisor[i] = sc.nextInt();
		}
		Arrays.sort(divisor);
		if (divisor.length % 2 == 0) {
			System.out.println(divisor[0] * divisor[divisor.length-1]);
		}else {
			System.out.println((int) Math.pow(divisor[divisor.length/2],2));
		}
		sc.close();
	}
}
