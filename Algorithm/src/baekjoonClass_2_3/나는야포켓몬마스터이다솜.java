package baekjoonClass_2_3;

import java.util.HashMap;
import java.util.Scanner;

public class 나는야포켓몬마스터이다솜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		for (int i = 1; i <= n; i++) {
			String temp = sc.next();
			map1.put(i, temp);
			map2.put(temp, i);
		}
		for (int i = 0; i < m; i++) {
			String temp = sc.next();
			if (Character.isDigit(temp.charAt(0))) {
				System.out.println(map1.get(Integer.parseInt(temp)));
			}else {
				System.out.println(map2.get(temp));
			}
		}
		sc.close();
	}
}
