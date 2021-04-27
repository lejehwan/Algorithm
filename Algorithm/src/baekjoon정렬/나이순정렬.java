package baekjoon정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 나이순정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] age = new String[n][2];
		for (int i = 0; i < age.length; i++) {
			age[i][0] = sc.next();
			age[i][1] = sc.next();
		}
		Arrays.sort(age, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				if (Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])) {
					return 1;// 먼저 온 사람의 나이가 크면 자리 바꾸기
				} else if (Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])) {
					return -1;// 아니라면 자리 유지
				}
				return 0;// 나이가 같다면 순서대로
			}
		});
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i][0] + " " +age[i][1]);
		}
		sc.close();
	}
}
