package programmersLevel1;

import java.util.HashSet;

public class 폰켓몬 {

}

class 폰켓몬Solution {
	public int solution(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		int answer = nums.length;
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		if (set.size() > answer / 2) {
			answer = answer / 2;
		} else {
			answer = set.size();
		}
		return answer;
	}
}