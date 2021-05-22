package programmersLevel1;

public class 약수의개수와덧셈 {

}

class 약수의개수와덧셈Solution {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			answer = cnt % 2 == 0 ? answer + i : answer - i;
		}
		return answer;
	}
}