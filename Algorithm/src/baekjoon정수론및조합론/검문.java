package baekjoon정수론및조합론;

import java.util.Arrays;
import java.util.Scanner;

// M : 몫 , r : 나머지
// A1 = M * a1 + r1
// A2 = M * a2 + r2
// A1 - A2 = M(a1 - a2) + r1 - r2
// 나머지가 같아야 하므로 r1 - r2 = 0
// 즉  A1 - A2 = M(a1 - a2)
// M은 (A1 - A2)의 약수 이므로 A1과 A2의 공약수가 됨

public class 검문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		int val = num[1] - num[0];
		int val2 = 0;
		for (int i = 2; i < num.length; i++) {
			val2 = num[i] - num[i-1];
			while (val2 != 0) {
				int temp = val % val2;
				val = val2;
				val2 = temp;
			}
		}
		for (int j = 2; j <= val; j++) {
			if (val % j == 0) {
				System.out.print(j + " ");
			}
		}
		sc.close();
	}
}
