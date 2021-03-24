package programmers;

public class 이상한문자만들기 {

}

class 이상한문자만들기Solution{
	public String solution(String s) {
		s = s.toUpperCase();
		String answer = "";
		int cnt = 0;
		String[] str = s.split("");
		for (int i = 0; i < str.length; i++) {
			cnt = str[i].contains(" ")?0:cnt+1;
			if (cnt%2 == 0) {
				str[i] = str[i].toLowerCase();
			}
			answer += str[i];
		}
		return answer;
	}
}