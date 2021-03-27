package programmersLevel1;

import java.util.ArrayList;

public class 같은숫자는싫어 {

}

class 같은숫자는싫어Solution{
	public int[] solution(int[] arr) {
		int value = arr[0];
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(value);
		for (int i = 1; i < arr.length; i++) {
			if (value == arr[i]) {
				continue;
			} else {
				list.add(arr[i]);
				value = arr[i];
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
