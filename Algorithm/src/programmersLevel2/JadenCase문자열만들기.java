package programmersLevel2;

public class JadenCase문자열만들기 {

}

class JadenCase문자열만들기Solution{
	public String solution(String s) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			if (flag) {
				sb.append(s.substring(i,i+1).toUpperCase());
				flag = false;
			}
			else {
				sb.append(s.substring(i,i+1).toLowerCase());
			}
			if (s.substring(i,i+1).equals(" ")) {
				flag = true;
			}
		}
		answer = sb.toString();
		return answer;
	}
}