package baekjoon그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] room = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				room[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(room, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			}
		});
		int cnt = 1;
		int i = 0;
		for (int j = i+1; j < room.length; j++) {
			if (room[i][1] <= room[j][0]) {
				cnt++;
				i=j;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
