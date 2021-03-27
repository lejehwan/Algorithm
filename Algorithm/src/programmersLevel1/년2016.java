package programmersLevel1;

public class 년2016 {

}

class 년2016Solution {
	public String solution(int a, int b) {
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] lastday = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        String answer = "";
        if (a == 1) {
			sum = b+4;
		} else {
			for (int i = 0; i < a-1; i++) {
				sum += lastday[i];
			}
			sum += b+11;
		}
        answer = week[sum%7];
        return answer;
	}
}