package programmers;

public class 짝수와홀수 {

}

class 짝수와홀수Solution{
	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}