package programmersLevel1;

import java.util.Stack;

public class 크레인인형뽑기게임 {

}

// 스택에 넣고 난 후 비교하는 것 보다는 
// 스택에 넣기 전에 비교하는 것이 효율적

class 크레인인형뽑기게임Solution{
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i< moves.length; i++){
            for(int j = 0; j<board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    int temp = (board[j][moves[i]-1]);                    
                    if(!stack.empty() && stack.peek()==temp){
                        stack.pop();
                        answer+=2;
                    }
                    else{
                        stack.push(temp);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }           
        }
        return answer;
	}
}