package baekjoon정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 통계학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			arr[i] = m;
			sum += m; 
		}
		Arrays.sort(arr);  
		
		boolean flag = false;
		int max = 0;
		int mode = 10000;
		
		for (int i = 0; i < n; i++) {
			int jump = 0;
			int cnt = 1;
			int value = arr[i]; 
			
			for (int j = i+1; j < n; j++) {
				if (value != arr[j]) {
					break;
				}
				cnt++;
				jump++;
			}
			if (cnt > max) {
				max = cnt;
				mode = value;
				flag = true;
			}
			else if (cnt == max && flag == true) {
				mode = value;
				flag = false;
			}
			i += jump;
		}
		System.out.println((int)Math.round((double)sum/n));
		System.out.println(arr[((n+1)/2)-1]);
		System.out.println(mode);
		System.out.println(arr[n-1] - arr[0]);
	}
}