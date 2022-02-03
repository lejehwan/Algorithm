package baekjoon분류모름;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CacheControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int capacity = sc.nextInt();
		Map<Integer, Integer> lru = new LinkedHashMap<Integer, Integer>(capacity, 1, true){
	        @Override
	        public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
	            return size() > capacity;
	        }
	    };
	    List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			lru.put(input, 0);
		}
		
		for (Integer key : lru.keySet()) {
			list.add(key);
		}
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		sc.close();
	}
}
