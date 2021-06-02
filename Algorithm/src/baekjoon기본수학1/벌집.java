package baekjoon기본수학1;

import java.util.Scanner;

public class 벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0; 
		int j = 0; 
		while (true) {
			int temp = 6*i;
			if (n <= temp+1) {
				break;
			}else {
				j++;
				i += j;
			}
		}
		System.out.println(j+1);
		sc.close();
	}
}
