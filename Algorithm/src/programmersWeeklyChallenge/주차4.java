package programmersWeeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class 주차4 {
	
}

class 주차4Solution {
	public String solution(String[] table, String[] languages, int[] preference) { 
        int[][] value = new int[languages.length][table.length];
		int[] sum = new int[table.length];
		int key = 0;
		String answer = "SI";
		
		for (int i = 0; i < table.length; i++) {
			String[] line = table[i].split(" ");
			for (int j = 1; j < line.length; j++) {
				for (int k = 0; k < languages.length; k++) {
					if (line[j].equals(languages[k])) {
						value[k][i] = (5 -(j-1))*preference[k];
					}
				}
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < value.length; j++) {
				sum[i] += value[j][i];
			}
			if (sum[i] > sum[key]) {
				key = i;
			}
			if (sum[i] == sum[key]) {
				String first = table[key].split(" ")[0];
				String second = table[i].split(" ")[0];
				ArrayList<String> dic = new ArrayList<String>();
				dic.add(first);
				dic.add(second);
				Collections.sort(dic);
				if (dic.get(0).equals(second)) {
					key = i;
				}
			}
		}
		answer = table[key].split(" ")[0];
		return answer;
    }
}