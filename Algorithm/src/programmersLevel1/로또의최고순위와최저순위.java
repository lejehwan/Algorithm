package programmersLevel1;

public class 로또의최고순위와최저순위 {
	
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		int cnt = 1;
		int zero = 0;
		for (int i = 0; i < lottos.length; i++) {
			boolean check = false;
			if (lottos[i] == 0) {
				zero ++;
				continue;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					check = true;
					break;
				}
			}
			if (!check) {
				cnt ++;
			}
		}
		if (cnt >= 6) {
			answer[0] = 6;
			answer[1] = 6;
		}else {
			answer[0] = cnt;
			if (cnt + zero >= 6) {
				answer[1] = 6;
			}else {
				answer[1] = cnt + zero;
			}
		}
        return answer;
    }
}