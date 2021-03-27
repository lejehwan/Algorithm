package programmersLevel1;

public class 자연수뒤집어배열로만들기 {

}

class 자연수뒤집어배열로만들기Solution{
	public int[] solution(long n) {
		String[] str = String.valueOf(n).split("");
		int[] answer = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			answer[str.length-1-i] = Integer.parseInt(str[i]);
		}
		return answer;
	}
}