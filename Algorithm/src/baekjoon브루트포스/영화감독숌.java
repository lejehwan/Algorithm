package baekjoon브루트포스;

import java.util.Scanner;

public class 영화감독숌 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int i = 666;
		while (true) {
			String title = Integer.toString(i);
			if (title.contains("666")) {
				cnt++;
				if (cnt == n) {
					System.out.println(i);
					break;
				}
			}
			i++;
		}
		sc.close();
	}
}
