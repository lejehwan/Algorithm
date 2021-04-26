package baekjoon정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 좌표정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] plane = new int[n][2];
		for (int i = 0; i < plane.length; i++) {
			plane[i][0] = sc.nextInt();
			plane[i][1] = sc.nextInt();
		}
		Arrays.sort(plane, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				// 첫 번째 파라미터로 넘어온 객체 - 두 번째 파라미터로 넘어온 객체 의 값이
				// 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 변경된다.
				if (o1[0] == o2[0]) {// x좌표의 값이 같다면
					return Integer.compare(o1[1], o2[1]);// y좌표 오름차순
				} else { // x좌표의 값이 다르다면
					return Integer.compare(o1[0], o2[0]);// x좌표 오름차순
				}
			}
		});
		for (int i = 0; i < plane.length; i++) {
			System.out.println(plane[i][0] + " " + plane[i][1]);
		}
		sc.close();
	}
}
