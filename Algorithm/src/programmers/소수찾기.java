package programmers;

public class 소수찾기 {

}

class 소수찾기Solution{
	public int solution(int n) {
		boolean check = true;
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < Math.sqrt(i) + 1; j++) {
				if (i%j == 0 && i!=j) {
					check = false;
					break;
				}
			}
			if (check) {
				answer ++;
			}
			check = true;
		}
		return answer;
	}
}