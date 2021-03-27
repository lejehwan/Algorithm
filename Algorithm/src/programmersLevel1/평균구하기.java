package programmersLevel1;

public class 평균구하기 {

}

class 평균구하기Solution{
	public double solution(int[] arr) {
		double answer = arr[0];
		for (int i = 1; i < arr.length; i++) {
			answer += arr[i];
		}
		answer /= arr.length;
		return answer;
	}
}