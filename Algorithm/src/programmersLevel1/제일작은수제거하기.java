package programmersLevel1;

import java.util.ArrayList;

public class 제일작은수제거하기 {

}

class 제일작은수제거하기Solution {
	public int[] solution(int[] arr) {
		int min = arr[0];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			if (arr.length == 1) {
				list.clear();
				list.add(-1);
				break;
			} else {
				min = Math.min(arr[i], min);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if ((int) list.get(i) == min) {
				list.remove(i);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = (int) list.get(i);
		}
		return answer;
	}
}