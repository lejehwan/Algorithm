package programmersLevel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 두개뽑아서더하기 {	
}

class 두개뽑아서더하기Solution{
	public int[] solution(int[] numbers) {
		int[] answer;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				hs.add(numbers[i] + numbers[j]);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(hs);
		Collections.sort(list);
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
}
