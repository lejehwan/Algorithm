package programmersWeeklyChallenge;

public class 주차2 {

}

class 주차2Solution {
    public String solution(int[][] scores) {
        int[] avg = new int[scores.length];
		for (int i = 0; i < scores.length; i++) {
			int max = -1; 
			int min = 101;
			int sum = 0;
			int temp = 0;
			boolean check = false;
			for (int j = 0; j < scores[0].length; j++) {
				max = Math.max(max, scores[j][i]);
				min = Math.min(min, scores[j][i]);
				sum += scores[j][i];
				temp = scores[i][i];
				if (temp == scores[j][i] && i != j) {
					check = true;
				}
			}
			if ((min == temp || max == temp) && check == false) {
				sum -= temp;
				avg[i] = Math.floorDiv(sum, avg.length-1);
			}else {				
				avg[i] = Math.floorDiv(sum, avg.length);
			} 
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < avg.length; i++) {
			switch (avg[i] / 10) {
			case 10:
			case 9:sb.append("A");break;
			case 8:sb.append("B");break;
			case 7:sb.append("C");break;
			case 6:
			case 5:sb.append("D");break;
			default:sb.append("F");break;
			}
		}
        return sb.toString();
    }
}