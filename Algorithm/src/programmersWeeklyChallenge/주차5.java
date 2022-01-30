package programmersWeeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//public class 주차5 {
//	
//}
//
//class 주차5Solution {
//	static Queue<String> queue;
//    static HashSet<String> hs;
//    public int solution(String word) {
//        int answer = 0;
//		queue = new LinkedList<String>();
//		hs = new HashSet<String>();
//		setting("A");
//		setting("E");
//		setting("I");
//		setting("O");
//		setting("U");
//		String[] arr = { "A", "E", "I", "O", "U" };
//		while (!queue.isEmpty()) {
//			String key = queue.poll();
//			if (key.length() == 5) {
//				continue;
//			}
//			for (int i = 0; i < 5; i++) {
//				String value = key + arr[i];
//				hs.add(value);
//				queue.add(value);
//			}
//		}
//		List<String> list = new ArrayList<String>();
//		for (String a : hs) {
//			list.add(a);
//		}
//		Collections.sort(list);
//		for(int i=0;i<list.size(); i++) {
//			if(list.get(i).equals(word)) {
//				answer = i+1;
//			}
//		}
//		return answer;
//	}
//
//	static void setting(String key) {
//		String value = key;
//		for (int i = 0; i < 5; i++) {
//			queue.add(key);
//			hs.add(key);
//			key += value;
//		}
//	}
//=======
//package programmersWeeklyChallenge;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;

public class 주차5 {
	
}

class 주차5Solution {
	static Queue<String> queue;
    static HashSet<String> hs;
    public int solution(String word) {
        int answer = 0;
		queue = new LinkedList<String>();
		hs = new HashSet<String>();
		setting("A");
		setting("E");
		setting("I");
		setting("O");
		setting("U");
		String[] arr = { "A", "E", "I", "O", "U" };
		while (!queue.isEmpty()) {
			String key = queue.poll();
			if (key.length() == 5) {
				continue;
			}
			for (int i = 0; i < 5; i++) {
				String value = key + arr[i];
				hs.add(value);
				queue.add(value);
			}
		}
		List<String> list = new ArrayList<String>();
		for (String a : hs) {
			list.add(a);
		}
		Collections.sort(list);
		for(int i=0;i<list.size(); i++) {
			if(list.get(i).equals(word)) {
				answer = i+1;
			}
		}
		return answer;
	}

	static void setting(String key) {
		String value = key;
		for (int i = 0; i < 5; i++) {
			queue.add(key);
			hs.add(key);
			key += value;
		}
	}
}