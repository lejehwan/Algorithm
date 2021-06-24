package 동적계획법3;

import java.util.HashSet;
import java.util.Scanner;

public class 집합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String input = sc.next();
			if (input.equals("add")) {
				hs.add(sc.nextInt());
			}else if (input.equals("remove")) {
				hs.remove(sc.nextInt());
			}else if (input.equals("check")) {
				if (hs.contains(sc.nextInt())) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
			}else if (input.equals("toggle")) {
				int temp = sc.nextInt();
				if (hs.contains(temp)) {
					hs.remove(temp);
				}else {
					hs.add(temp);
				}
			}else if (input.equals("empty")) {
				hs.clear();
			}else if (input.equals("all")) {
				hs.clear();
				for (int j = 1; j <= 20; j++) {
					hs.add(j);
				}
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
