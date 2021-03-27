package programmersLevel1;

public class 두정수사이의합 {

}

class 두정수사이의합Solution{
	public long solution(int a, int b) {
		long big = Math.max(a, b);
		long small = Math.min(a, b);
		long answer = 0;
		for (long i = small; i <= big; i++) {
			answer += i;
		}
		return answer;
	}
}