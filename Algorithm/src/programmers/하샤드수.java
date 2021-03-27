package programmers;

public class 하샤드수 {

}

class 하샤드수Solution{
	public boolean solution(int x) {
		int sum = 0;
		int divisor = x;
		boolean answer = false;
		while (x > 0) {
			sum += x % 10;
			x/=10;
		}
		if (divisor % sum == 0) {
			answer = true;
		}
		return answer;
	}
}