package baekjoon정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class 단어정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> hs = new HashSet<String>();// 해쉬 셋(중복 제거)
		for (int i = 0; i < n; i++) {
			hs.add(sc.next());
		}
		ArrayList<String> list = new ArrayList<String>(hs);// 리스트로변환(정렬을 위해)
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				// 길이 순으로 오름차순
				if (o1.length() > o2.length()) {
					return 1;// 양수면 뒤로
				} else if (o1.length() < o2.length()) {
					return -1;// 음수면 앞으로
				}
				return o1.compareTo(o2);// 길이가 같으면 사전순 정렬(오름차순)
			}
		});
		for (String answer : list) {
			System.out.println(answer);
		}
		sc.close();
	}
}
