package programmers;

public class 콜라츠추측 {
	
}

class 콜라츠추측Solution{
	public int solution(long num) {
		for (int i = 1; i <= 500; i++) {
			if (num == 1) {
				return i-1;
			} else {
				if (num %2 ==0) {
					num/=2;
				} else {
					num = num*3 +1;
				}
			}		
		}
		return -1;
	}
}