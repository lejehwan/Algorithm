package programmersLevel1;

public class 신규아이디추천 {
	 
}

class 신규아이디추천Solution1 {
	public String solution(String new_id) {
		String answer = "";
		// 1단계
		new_id = new_id.toLowerCase();
		// 2단계
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if (ch == '-' || ch == '_' || ch == '.' || (ch >= '0' && ch <= '9')
					|| (ch >= 'a' && ch <= 'z')) {
				answer += String.valueOf(ch);
			}
		}
		// 3단계
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		// 4단계
		if (answer.charAt(0) == '.') {
			answer = answer.substring(1,answer.length());
		}
		if (answer.length() >= 1) {
			if (answer.charAt(answer.length()-1) == '.') {
				answer = answer.substring(0,answer.length()-1);
			}
		}
		// 5단계
		if (answer.length() == 0) {
			answer += "a";
		}
		// 6단계
		if (answer.length() >= 16) {
			answer = answer.substring(0,15);
			if (answer.charAt(answer.length()-1) == '.') {
				answer = answer.substring(0,answer.length()-1);
			}
		}
		// 7단계
		if (answer.length() <= 2) {
			for (int i = answer.length(); i < 3; i++) {
				answer += answer.substring(answer.length()-1);
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
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        // 3단계
        answer = answer.replaceAll("[.]{2,}", ".");
        // 4단계
        answer = answer.replaceAll("^[.]|[.]$", "");
        // 5단계
        if (answer.equals("")) {
            answer += "a";
        }
        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }
        // 7단계
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
            	answer += answer.substring(answer.length()-1);
            }
        }
		return answer;
	}
}