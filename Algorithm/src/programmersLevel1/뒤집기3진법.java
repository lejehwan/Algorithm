package programmersLevel1;

import java.util.ArrayList;
import java.util.Collections;

public class 뒤집기3진법 {

}

class 뒤집기3진법Solution{
	public int solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (n >= 1) {
			list.add(n%3);
			n /= 3;
		}
		Collections.reverse(list);
		int answer = 0;
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i)*Math.pow(3, i);
		}
		return answer;
	}
}
