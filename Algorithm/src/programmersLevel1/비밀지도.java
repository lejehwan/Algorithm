package programmersLevel1;

public class 비밀지도 {

}

class 비밀지도Solution1 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
        int[][] arr3 = new int[n][n];
        int[][] arr4 = new int[n][n];
        int[][] arr5 = new int[n][n];
        // 첫번째 그림, arr3에 대입
		for (int i = 0; i < arr1.length; i++) {
			for (int j = arr3.length - 1; j >= 0; j--) {
				arr3[i][j] = arr1[i] % 2;
				arr1[i] /= 2;
			}
		}
		// 두번째 그림, arr4에 대입
		for (int i = 0; i < arr2.length; i++) {
			for (int j = arr4.length - 1; j >= 0; j--) {
				arr4[i][j] = arr2[i] % 2;
				arr2[i] /= 2;
			}
		}
		// 벽은 or 조건, 공백은 and 조건에 맞게 arr5에 대입
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr4.length; j++) {
				if (arr3[i][j] == 1 || arr4[i][j] == 1) {
					arr5[i][j] = 1;
				} else if (arr3[i][j] == 0 && arr4[i][j] == 0) {
					arr5[i][j] = 0;
				}
			}
		}
		// 1이면 #으로, 0이면 공백으로 바꾸어 문자열에 넣은후 ,그 문자열을 answer배열에 대입
		String s = "";
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (arr5[i][j] == 1) {
					s += "#";
				} else if (arr5[i][j] == 0) {
					s += " ";
				}
			}
			answer[i] = s;
			s = "";
		}
        return answer;
	}
}

class 비밀지도Solution2 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}
		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "s", answer[i]);
			answer[i] = answer[i].replaceAll("1", "#");
			answer[i] = answer[i].replaceAll("0", " ");
		}
		return answer;
	}
}