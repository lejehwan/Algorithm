package programmersLevel1;

public class 핸드폰번호가리기 {

}

class 핸드폰번호가리기Solution{
	public String solution(String phone_number) {
		String[] str = phone_number.split("");
		phone_number = phone_number.substring(str.length-4, str.length);
		String answer = "";
		for (int i = 0; i < str.length-4; i++) {
			answer += "*";
		}
		answer += phone_number;
		return answer;
	}
}