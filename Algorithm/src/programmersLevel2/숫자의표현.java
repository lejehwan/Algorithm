package programmersLevel2;

public class 숫자의표현 {

}
 
class 숫자의표현Solution{
	public int solution(int n) {
		int answer = 1;
		int sum = 0;
		for (int i = 1; i <= n/2+1; i++) {
			sum = 0;
			for (int j = i; j <= n/2+1; j++) {
				sum += j;
				if (sum == n) {
					answer++;
					break;
				} else if (sum > n) {
					break;
				}
			}
		}
		return answer;
	}
}