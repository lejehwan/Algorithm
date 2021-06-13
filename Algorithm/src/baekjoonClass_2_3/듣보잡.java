package baekjoonClass_2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class 듣보잡 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			hs.add(sc.next());
		}
		for (int i = 0; i < m; i++) {
			String temp = sc.next();
			if (hs.contains(temp)) {
				list.add(temp);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (String answer : list) {
			System.out.println(answer);
		}
		sc.close();
	}
}
