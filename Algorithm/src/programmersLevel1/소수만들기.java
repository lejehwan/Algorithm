package programmersLevel1;

public class 소수만들기 {

}

class 소수만들기Solution{
	public int solution(int[] nums) {
		int answer = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int sum = nums[i]+nums[j]+nums[k];
					boolean check = true;
					for (int l = 2; l <= Math.sqrt(sum); l++) {
						if (sum % l == 0) {//나누어떨어진다 -> 소수가 아님
							check = false;//거짓
							break;//반복문 빠져나감
						}
					}
					if (check) {//다 돌았는데도 true이면 소수
						answer ++;
					}
				}
			}
		}
		return answer;
	}
}