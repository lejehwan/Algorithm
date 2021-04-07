package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 실패율구하기 {

}
  
// 합계 : 92.6/100.0
// 테케 1,12 실패

class 실패율구하기Solution{
	public int[] solution(int N, int[] stages) {
		int[] realanswer = new int[N];
        double[] answer = new double[N];
        Arrays.sort(stages);
        int cnt = 0;
        //실패율 구하기
        double result = stages.length;
        for(int i = 1; i<=N; i++){
            for(int j = i-1; j< stages.length; j++){
                if(i == stages[j]){
                    cnt++;
                }
            }
            if (result == 0) {
				continue;
			}else {
				answer[i-1] = cnt/result;
	            result -=cnt;
	            cnt = 0;
			}            
        }
        //구한 실패율을 list에 넣고
        ArrayList<Double> list = new ArrayList<Double>();
        for(double i : answer){
            list.add(i);
        }
        //내림차순 정렬
        Collections.sort(list);
        Collections.reverse(list);
        //정렬 된것을 실수형 배열에 넣기
        double[] ranswer = new double[N];
        for(int i = 0; i< list.size(); i++){
            ranswer[i] = (double)list.get(i);
        }
        //만약 원래 배열의 값과 현재 배열의 값이 같으면 원래 배열의 인덱스+1한 값을 새로운 배열에 넣고 원래 배열은 다시 나올수 없게 -1로 설정한다
        for(int i = 0; i< ranswer.length; i++){
            for(int j = 0; j< answer.length; j++){
                if(ranswer[i] == answer[j]){
                    ranswer[i] = j+1;
                    answer[j] = -1;
                    break;
                }
            }
        }
        for(int i = 0; i< realanswer.length; i++){
            realanswer[i] = (int)ranswer[i];
        }
        return realanswer;
	}
}