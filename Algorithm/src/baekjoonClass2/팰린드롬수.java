package baekjoonClass2;

import java.util.Scanner;

public class 팰린드롬수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String n = sc.next();
			if (n.equals("0")) {
				break;
			}
			boolean check = true;
			for (int i = 0; i < n.length() / 2; i++) {
				if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
					check = false;
					System.out.println("no");
					break;
				}
			}
			if (check) {
				System.out.println("yes");
			}
		}
		sc.close();
	}
}