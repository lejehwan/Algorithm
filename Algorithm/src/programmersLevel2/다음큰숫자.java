package programmersLevel2;

public class 다음큰숫자 {

}

// 배열로써 1의 갯수를 찾는 것은 비효율
// 따라서 문자형태로 찾음

class 다음큰숫자Solution1 {
	public int solution(int n) {
		int answer = 0;
		int cntN = 0;
		int cntI = 0;
		String binaryN = Integer.toBinaryString(n);
		for (int i = 0; i < binaryN.length(); i++) {
			if (binaryN.charAt(i) == '1') {
				cntN++;
			}
		}
		answer = n;
		while (true) {
			cntI = 0;
			answer++;
			String binaryI = Integer.toBinaryString(answer);
			for (int j = 0; j < binaryI.length(); j++) {
				if (binaryI.charAt(j) == '1') {
					cntI++;
				}
			}
			if (cntI == cntN) {
				break;
			}
		}
		return answer;
	}
}

// Integer.bitCount()이용하기

class 다음큰숫자Solution2 {
	public int solution(int n) {
		int cnt = Integer.bitCount(n);
		int answer = n+1;
		while (true) {
			if (Integer.bitCount(answer) == cnt) {
				break;
			}
			answer++;
		}
		return answer;
	}
}