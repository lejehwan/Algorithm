//package programmersLevel1;
//
//import java.util.Stack;
//
//public class 키패드누르기 {
//	public static void main(String[] args) {
//		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//		String hand = "right";
//	}
//
//}
//
//class 키패드누르기Solution {
//	public String solution(int[] numbers, String hand) {
//		String answer = "";
//		int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
//		Stack<int[][]> Lstack = new Stack<int[][]>();
//		Stack<int[][]> Rstack = new Stack<int[][]>();
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < keypad[0].length; j++) {
//				if (numbers[i] == keypad[0][j] && keypad[0][j] != -1) {
//					answer += "L";
//					Lstack.add(keypad[0][]);
//				}else if (numbers[i] == keypad[2][j] && keypad[2][j] != -1) {
//					answer += "R";
//					Rstack.add(j);
//				}else if (numbers[i] == keypad[1][j]) {
//					if ((i-0)+Math.abs(j-Lstack.peek()) ) {
//						
//					}
//				}
//			}
//			
//			
//		}
//		return answer;
//	}
//}