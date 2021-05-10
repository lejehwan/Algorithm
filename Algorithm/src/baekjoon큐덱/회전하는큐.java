package baekjoon큐덱;

import java.util.LinkedList;
import java.util.Scanner;

public class 회전하는큐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		//큐의 크기 list에 저장
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		int cnt = 0;
		int num = 0;
		for (int i = 0; i < m; i++) {
			num = sc.nextInt();
			// 찾는 위치가 처음이 아니라면
			while (num != list.get(0)) {
				//해당 숫자의 인덱스 값보다 list의 사이즈의 절반이 크면
				// 정방향
				if (list.indexOf(num) <= list.size()/2) {
					int first = list.getFirst();
					list.removeFirst();
					list.addLast(first);
				}
				// 작다면 역방향
				else {
					int last = list.getLast();
					list.removeLast();
					list.addFirst(last);
				}
				cnt++;
			}
			list.removeFirst();// 해당 숫자 삭제
		}
		System.out.println(cnt);
		sc.close();
	}
}