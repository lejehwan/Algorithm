package programmersLevel1;


class 숫자문자열과영단어Solution1 {

	public int solution(String s) {
		String[] englishWord = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < englishWord.length; i++) {
			s = s.replace(englishWord[i], String.valueOf(i));
		}
		return Integer.parseInt(s);
	}
}

class 숫자문자열과영단어Solution2 {

	public int solution(String s) {
		String[] englishWord = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String answer = "";
		String[] ssplit = s.split("");
		String temp = "";
		for (int i = 0; i < ssplit.length; i++) {
			try {
				Integer.parseInt(ssplit[i]);
				answer += ssplit[i];
			} catch (Exception e) {
				temp += ssplit[i];
			}
			for (int j = 0; j < englishWord.length; j++) {
				if (temp.equals(englishWord[j])) {
					answer += String.valueOf(j);
					temp = "";
				}
			}
		}
		return Integer.parseInt(answer);
	}
}