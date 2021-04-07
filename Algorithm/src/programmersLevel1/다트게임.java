package programmersLevel1;

public class 다트게임 {

}

class 다트게임Solution{
	public int solution(String dartResult) {
		int answer = 0;
        int[] result = new int[3];
        String temp = "";
        for(int i = 0; i< dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(c>='0' && c<='9'){
                temp += String.valueOf(c);
            }
            else if(c=='S' || c=='D' || c=='T'){
                int sum = Integer.parseInt(temp);
                if(c=='S'){
                    sum = (int)Math.pow(sum, 1);
                }
                else if(c== 'D'){
                    sum = (int)Math.pow(sum ,2);
                }
                else if(c== 'T'){
                    sum = (int)Math.pow(sum ,3);
                }
                result[answer++] = sum;
                temp = "";
            }
            else{
                if(c=='*'){
                    result[answer-1] *=2;
                    if(answer-2 >=0){
                        result[answer-2] *=2;
                    }
                }
                else if(c=='#'){
                    result[answer-1] *= -1;
                }
            }
        }
        int ranswer = 0;
        for(int i : result){
            ranswer += i;
        }
        return ranswer;
	}
}