package baekjoon기본수학2;

import java.util.Scanner;

public class 네번째점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstX = sc.nextInt();
		int firstY = sc.nextInt();
		int secondX = sc.nextInt();
		int secondY = sc.nextInt();
		int thirdX = sc.nextInt();
		int thirdY = sc.nextInt();
		int answerX = thirdX;
		int answerY = thirdY;
		if (firstX != secondX) {
			if (firstX != thirdX) {
				answerX = firstX;
			}else {
				answerX = secondX;
			}
		}
		if (firstY != secondY) {
			if (firstY != thirdY) {
				answerY = firstY;
			}else {
				answerY = secondY;
			}
		}
		System.out.print(answerX + " " + answerY);
		sc.close();
	}
}
