package programmersLevel1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {

}

class 문자열내림차순으로배치하기Solution{
	public String solution(String s) {
		String[] str = s.split("");
		Arrays.sort(str);
		String answer = "";
		for (int i = str.length-1; i >= 0; i--) {
			answer += str[i];
		}
		return answer;
	}
}