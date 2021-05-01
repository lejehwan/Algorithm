package baekjoon브루트포스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 블랙잭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] card = new int[n];
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}
		for (int i = 0; i < card.length; i++) {
			for (int j = i+1; j < card.length; j++) {
				for (int k = j+1; k < card.length; k++) {
					sum = card[i] + card[j] + card[k];
					if (sum <= m) {
						list.add(sum);
					}
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		sc.close();
	}
}
