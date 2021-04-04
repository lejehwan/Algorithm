package programmersLevel1;

public class 체육복 {
	
}

//이 문제는 그리디 이므로 최적의 해를 찾는 것이 아니라 순간순간 최적의 판단을 하는 것이다
//따라서 최적의 해가 맞을수도 있고 아닐수도 있다.
//그러므로 이 문제를 접근 하기 위해서는 먼저 최적의 판단을 내려야 한다는 것이다.
//1. 이 문제의 최적의 판단은 => 여벌 체육복을 가지고 있고, 도난도 당한 학생일 경우 먼저 제거한다
//2. 그리고 나서 체육복을 앞 또는 뒷 사람에게 빌려준다
//그렇기 때문에 최적의 해는 아니다. 
//테케는 n = 5; lost = {3,4}; reserve={4,5};
//테케의 최적의 해는 5 이지만 그리디로 풀 경우 답은 4가 나온다
//왜냐하면 학생4는 여벌과 도난이 중복이기 때문에 먼저 제거 하고 나면
//도난 당한 학생은 : 3
//여벌을 가진 학생은 : 5       이므로 빌려줄수 없게 된다.

class 체육복Solution{
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;
        // 여벌 체육복과 도난이 중복일 경우
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j< reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer ++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                 }
            }
        }
        // 한번 빌려줫으면 다시는 못빌려줌
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j< reserve.length; j++){
                if(lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1){
                    answer++;                    
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
	}
}