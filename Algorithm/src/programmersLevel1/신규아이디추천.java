package programmersLevel1;

public class 신규아이디추천 {

}

class 신규아이디추천Solution1 {
	public String solution(String new_id) {
		String answer = "";
		// step1
		new_id = new_id.toLowerCase();
		// step2
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == '-' || ch == '_' || ch == '.') {
				answer += String.valueOf(ch);
			}
		}
		// step3
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		// step4
		if (answer.charAt(0) == '.') {
			answer = answer.substring(1, answer.length());
		}
		if (answer.length() >= 1) {
			if (answer.charAt(answer.length() - 1) == '.') {
				answer = answer.substring(0, answer.length() - 1);
			}
		}
		// step5
		if (answer.length() == 0) {
			answer += "a";
		}
		// step6
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
			if (answer.charAt(answer.length() - 1) == '.') {
				answer = answer.substring(0, 14);
			}
		}
		// step7
		if (answer.length() <= 2) {
			for (int i = answer.length(); i < 3; i++) {
				answer += answer.substring(answer.length() - 1);
			}
		}
		return answer;
	}
}

// 정규표현식을 이용한 풀이
class 신규아이디추천Solution2 {
	public String solution(String new_id) {
		// 1단계
		String answer = new_id.toLowerCase();
		// 2단계
		answer = answer.replaceAll("[^-_.a-z0-9]", ""); // - _ . a부터z 0부터9를 제외한 것들은 공백으로 치환
		// 3단계
		answer = answer.replaceAll("[.]{2,}", ".");// .이 2번 이상 반복되면 .으로 치환
		// 4단계
		answer = answer.replaceAll("^[.]|[.]$", "");// 시작이 . 또는 종료가 .이면 공백으로 치환
		// 5단계
		if (answer.equals("")) {
			answer += "a";
		}
		// 6단계
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("[.]$", ""); // .으로 종료하면 공백으로 치환
		}
		// 7단계
		if (answer.length() <= 2) {
			while (answer.length() < 3) {
				answer += answer.substring(answer.length() - 1);
			}
		}
		return answer;
	}
}