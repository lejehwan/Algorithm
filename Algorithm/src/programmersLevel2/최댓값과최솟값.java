package programmersLevel2;

import java.util.Arrays;

public class 최댓값과최솟값 {
	public static void main(String[] args) {
		String s = "1 2 3 4";
		String answer = "";
		String[] str = s.replaceAll(" +", " ").split(" ");
		int max = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[0]);
		for (int i = 1; i < str.length; i++) {
			max = Math.max(max, Integer.parseInt(str[i]));
			min = Math.min(min, Integer.parseInt(str[i]));
		}
		answer += String.valueOf(min) + " " +String.valueOf(max);
		System.out.println(answer);
	}
 
}

class 최댓값과최솟값Solution1 {
	public String solution(String s) {
		String answer = "";
		String[] str = s.replaceAll(" +", " ").split(" ");
		int max = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[0]);
		for (int i = 1; i < str.length; i++) {
			max = Math.max(max, Integer.parseInt(str[i]));
			min = Math.min(min, Integer.parseInt(str[i]));
		}
		answer += String.valueOf(min) + " " +String.valueOf(max);
		return answer;
	}
}

class 최댓값과최솟값Solution2 {
	public String solution(String s) {
		String answer = "";
        String[] str = s.trim().replaceAll(" +"," ").split(" ");        
        int[] arr = new int[str.length];
        for(int i = 0; i< str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }        
        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length-1];
        return answer;
	}
}