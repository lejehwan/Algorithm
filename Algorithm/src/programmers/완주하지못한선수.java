package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {
}

class 완주하지못한선수Solution {

	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		String answer = "";
		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		if (answer.equals("")) {
			answer = participant[participant.length - 1];
		}
		return answer;
	}
}

//String[] participant= {"mislav","stanko","mislav","ana"};
//String[] completion= {"stanko","ana","mislav"};

class 완주하지못한선수Solution2 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);// 동명이인이 있을수도 있기에 ex)mislav = 2, stanko=1,ana=1
		} // hm.getOrDefault() 찾고자 하는 키(이름)가 있다면 키의 값을 반환하고, 없다면 기본값 반환
		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);// 여기서 들어간 키의 값을 빼준다 ex) mislav = 1, stanko=0,ana=0
		}
		for (String key : hm.keySet()) {// set 객체를 통해 key값을 가져옴
			if (hm.get(key) != 0) {
				answer = key;// mislav
				break;
			}
		}
		return answer;// mislav
	}
}