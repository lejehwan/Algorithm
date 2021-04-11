package programmersLevel2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

}

//Comparable 의 경우 기본 정렬 기준(오름차순) 뿐이므로
//Comparator 을 사용하면 내가 원하는 기준으로 정렬 시킬수 있음

class 가장큰수Solution{
	public String solution(int[] numbers) {
		String answer = "";
		String[] str = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		// 두 수를 앞,뒤로 붙여 큰 수를 리턴하도록 내림차순 정렬
		Arrays.sort(str, new Comparator<String>() { 
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
		});
//		// 람다 이용
//		Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		if (str[0].equals("0")) {
			return "0";
		}
		for (int i = 0; i < str.length; i++) {
			answer += str[i];
		}
		return answer;
	}
}