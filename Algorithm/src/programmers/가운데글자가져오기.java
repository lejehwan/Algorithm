package programmers;

public class 가운데글자가져오기 {

}

class 가운데글자가져오기Solution{
	public String solution(String s) {
		String[] str = s.split("");
		String answer = "";
		if (str.length%2==0) {
			answer = str[str.length/2-1] + str[str.length/2];
		} else {
			answer = str[str.length/2];
		}
		return answer;
	}
}