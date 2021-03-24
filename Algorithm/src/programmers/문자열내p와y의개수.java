package programmers;

public class 문자열내p와y의개수 {

}

class 문자열내p와y의개수Solution{
	public boolean solution(String s) {
		s = s.toLowerCase();
		int check = 0;
		String[] str = s.split("");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("p")) {
				check++;
			}else if (str[i].equals("y")) {
				check--;
			}
		}
		if (check == 0) {
			return true;
		} else {
			return false;
		}
	}
}