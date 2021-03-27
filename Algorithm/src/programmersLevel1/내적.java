package programmersLevel1;

public class 내적 {

}

class 내적Solution{
	public int solution(int[] a, int[] b) {
		int answer = 0;
		for (int i = 0; i < b.length; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}
}