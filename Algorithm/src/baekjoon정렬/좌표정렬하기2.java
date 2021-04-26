package baekjoon정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 좌표정렬하기2 {
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
				if (o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				} else {
					return Integer.compare(o1[1], o2[1]);
				}
			}
		});
		for (int i = 0; i < plane.length; i++) {
			System.out.println(plane[i][0] + " " + plane[i][1]);
		}
		sc.close();
	}
}
