package programmersLevel1;

public class 서울에서김서방찾기 {

}

class 서울에서김서방찾기Solution{
	public String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}
		return answer;
	}
}