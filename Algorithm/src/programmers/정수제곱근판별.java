package programmers;

public class 정수제곱근판별 {

}

class 정수제곱근판별Solution{
	public long solution(long n) {
		double check1 = Math.sqrt(n);
		long check2 = (int)check1;
		long answer = 0;
		if (check2 == check1) {
			answer = (long)Math.pow(check2+1, 2);
		} else {
			answer = -1;
		}
		return answer;
	}
}