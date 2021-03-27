package programmersLevel1;

public class 약수의합 {

}

class 약수의합Solution {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			answer += n % i == 0 ? i : 0;
		}
		return answer;
	}
}