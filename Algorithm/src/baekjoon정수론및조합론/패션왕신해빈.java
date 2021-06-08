package baekjoon정수론및조합론;

import java.util.HashMap;
import java.util.Scanner;

// 각각의 안입는 경우를 포함시켜 계산 후 전부 안입는 경우(알몸) 의 경우 => -1을 해줌
// 1번의 테케의 경우 headgear 2가지, eyewear 1가지 이지만 각각의 안입는 경우를 더해줌 => 3가지 , 2가지
// 3가지 * 2가지 = 6	알몸의 경우 -1 => 5가 됨

public class 패션왕신해빈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				sc.next();
				String temp = sc.next();
				if (hm.containsKey(temp)) {
					hm.put(temp, hm.get(temp) + 1);
				} else {
					hm.put(temp, 1);
				}
			}
			int answer = 1;
			for (int val : hm.values()) {
				answer *= val + 1;
			}
			System.out.println(answer - 1);
		}
		sc.close();
	}
}
