package baekjoon기본수학2;

import java.util.Scanner;

public class 직각삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if (x == y && x == z && x == 0) {
				break;
			}
			if (x * x == y * y + z * z || y * y == x * x + z * z || z * z == x * x + y * y) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}

//public class 직각삼각형 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			int z = sc.nextInt();
//			if (x == y && x == z && x == 0) {
//				break;
//			}
//			int max = Integer.MIN_VALUE;
//			int min1 = Integer.MAX_VALUE;
//			int min2 = Integer.MAX_VALUE;
//			if (x > y) {
//				if (x > z) {
//					max = x;
//					min1 = y;
//					min2 = z;
//				} else {
//					max = z;
//					min1 = x;
//					min2 = y;
//				}
//			} else {
//				if (y > z) {
//					max = y;
//					min1 = x;
//					min2 = z;
//				} else {
//					max = z;
//					min1 = x;
//					min2 = y;
//				}
//			}
//			if (max * max == min1 * min1 + min2 * min2) {
//				System.out.println("right");
//			} else {
//				System.out.println("wrong");
//			}
//		}
//		sc.close();
//	}
//}