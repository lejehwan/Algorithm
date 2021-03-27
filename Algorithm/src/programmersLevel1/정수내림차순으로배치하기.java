package programmersLevel1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
}

class 정수내림차순으로배치하기Solution{
	public long solution(long n) {
		String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        String temp = "";
        for(int i = str.length-1; i >=0; i--){
        	temp += str[i];
        }
        Long answer = Long.parseLong(temp);
        return answer;
	}
}