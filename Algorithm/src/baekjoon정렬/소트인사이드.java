package baekjoon정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 소트인사이드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.next().split("");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < temp.length; i++) {
			list.add(Integer.parseInt(temp[i]));
		}
		Collections.sort(list);
		Collections.reverse(list);
		String answer = "";
		for (Integer i : list) {
			answer += i;
		}
		System.out.println(answer);
		sc.close();
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String n = br.readLine();
//		Integer[] arr = new Integer[n.length()];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = n.charAt(i)-48;
//		}
//		Arrays.sort(arr, Collections.reverseOrder());
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//	}
}
