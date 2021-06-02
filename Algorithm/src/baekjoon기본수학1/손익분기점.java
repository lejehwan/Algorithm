package baekjoon기본수학1;

import java.util.Scanner;

public class 손익분기점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int count = 0;
		while (true) {
			if (B >= C) {
				System.out.println("-1");
				break;
			} else if (A >= (C - B) * count) {
				count++;
			} else {
				System.out.println(count);
				break;
			}  
		} 
		sc.close();
	}
}
