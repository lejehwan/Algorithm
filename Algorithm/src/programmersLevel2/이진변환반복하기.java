package programmersLevel2;

public class 이진변환반복하기 {

}

class 이진변환반복하기Solution{
	public int[] solution(String s) {
		int[] answer = new int[2];
		int cnt = 0; // 횟수
		int sum = 0; // 제거된 0개수
		while (!s.equals("1")) {
			int temp = 0;
			String[] str = s.split("");
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals("0")) {
					temp++;
				}
			}
			sum += temp;
			s = Integer.toBinaryString(s.length()-temp);
			cnt++;
		}
		answer[0] = cnt;
		answer[1] = sum;
		return answer;
	}
}