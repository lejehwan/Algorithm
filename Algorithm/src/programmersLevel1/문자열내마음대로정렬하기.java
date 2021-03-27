package programmersLevel1;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
}

class 문자열내마음대로정렬하기Solution{
	public String[] solution(String[] strings, int n) {
		for (int i = 0; i < strings.length; i++) {
			String[] value = strings[i].split("");
			strings[i] = value[n] + strings[i];
		}
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].substring(1);
		}
		return strings;
	}
}