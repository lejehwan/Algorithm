package programmers;

public class 문자열다루기기본 {

}

class 문자열다루기기본Solution {
	public boolean solution(String s) {
		if (s.length() != 4 && s.length() != 6) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch < 48 || ch > 58) {
					return false;
				}
			}
		}
		return true;
	}
}