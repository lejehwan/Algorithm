package baekjoon기본수학2;

import java.util.Scanner;

public class 소수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			arr[i] = true;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {// 2 3 4 => 제곱근 전까지의 반복횟수
			if (arr[i]) {// true 이면 반복 //제곱근 전까지의 숫자의 배수 제외
				for (int j = 2; j * i <= n; j++) {	// 2의 배수 4 6 8 10 12 14 16
					arr[i * j] = false; 			// 3의 배수 6 9 12 15
				} 									// 4의 배수 4 8 12 16 = >false
			} 										// true => 2 3 5 7 11 13
		}
		for (int i = m; i <= n; i++) {
			if (arr[i]) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
//public class 소수구하기 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		for (int i = m; i <= n; i++) {
//			boolean check = true;
//			if (i == 1) {
//				continue;
//			}
//			for (int j = 2; j <= Math.sqrt(i); j++) {
//				if (i % j == 0) {
//					check = false;
//					break;
//				}
//			}
//			if (check) {
//				System.out.println(i);
//			}
//		}
//		sc.close();
//	}
//}