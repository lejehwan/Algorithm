package programmersLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {

}

class 최솟값만들기Solution1 {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < B.length; i++) {
			answer += A[i] * B[B.length-i-1];
		}
		return answer;
	}
}

// 내림차순 정렬하기 위해 Collections.reverse 사용(list)
class 최솟값만들기Solution2 {
	public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< B.length; i++){
            list.add(B[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int i = 0; i< B.length; i++){
            answer += A[i] * list.get(i);
        }
        return answer;
    }
}