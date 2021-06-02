package baekjoon기본수학1;

import java.util.Scanner;

public class 설탕배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		boolean check = true;
		while (n != 0) {
			if (n % 5 == 0) {
				int temp = n / 5;
				System.out.println(temp + cnt);
				check = false;
				break;
			} else if (n == 1 || n == 2 || n == 4) {
				System.out.println(-1);
				check = false;
				break;
			} else {
				n -= 3;
				cnt++;
			}
		}
		if (check)
		{
			System.out.println(cnt);
		}
		sc.close();
	}
}

// 2배 빠른 방법

//public class Main {
//
//	public static void main(String[] args)  {
//	
//		Scanner sc = new Scanner(System.in);		
//		int c = sc.nextInt();
//		int res = 0;
//		
//		while (true) {
//			if (c %5 ==0) {
//				System.out.println(c /5 + res);break;
//			}
//			else if(c <= 0) {
//				System.out.println("-1");break;
//			}
//			else{
//				c -= 3;
//				res++;
//			}
//		}
//		
//	}
//	
//}