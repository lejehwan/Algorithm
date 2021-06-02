package baekjoon기본수학1;

import java.util.Scanner;

public class 부녀회장이될테야 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int k = sc.nextInt();// 층
			int n = sc.nextInt();// 호수
			int[][] apart = new int[k+1][n];
			for (int j = 0; j < apart.length; j++) {
				for (int l = 0; l < apart[0].length; l++) {
					if (j == 0) {
						apart[j][l] = l+1;
						continue;
					}
					if (l == 0) {
						apart[j][l] = 1;
					}else {
						int hap = 0;
						for (int l2 = 0; l2 <= l; l2++) {
							hap += apart[j-1][l2];
						} 
						apart[j][l] = hap;
					}
				}
			}
			System.out.println(apart[k][n-1]);
		}
		sc.close();
	}
}

// 효율적인 코드

//public static void main(String[] args) {
//	
//	Scanner sc = new Scanner(System.in);
//	// 범위 내의 최대 크기의 배열 생성
//	int[][] apart = new int[15][15];
//	// i층의 1호는 1명
//	// 0층에서의 i호의 입주자는 i명
//	for(int i = 0; i < 15; i++) {
//		apart[i][1] = 1;
//		apart[0][i] = i;
//	}
//	// 같은 층의 앞의 집과 바로 아래집의 합을 저장
//	for(int i = 1; i < 15; i ++) {
//		for(int j = 2; j < 15; j++) {
//			apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
//		}
//	}
//	int tc = sc.nextInt();
//	for(int i = 0; i < tc; i++) {
//		int k = sc.nextInt();
//		int n = sc.nextInt();
//		System.out.println(apart[k][n]);
//	}
//}