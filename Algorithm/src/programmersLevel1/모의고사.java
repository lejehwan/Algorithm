package programmersLevel1;

import java.util.ArrayList;

public class 모의고사 {

}

class 모의고사Solution{
	public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == a[i%5]){
                cnt[0]++;
            }
            if(answers[i] == b[i%8]){
                cnt[1]++;
            }
            if(answers[i] == c[i%10]){
                cnt[2]++;
            }
        }
        int result = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(result == cnt[0]){
            list.add(1);
        }
        if(result == cnt[1]){
            list.add(2);
        }
        if(result == cnt[2]){
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = (int)list.get(i);
        }
        return answer;
    }
}