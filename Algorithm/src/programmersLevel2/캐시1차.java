package programmersLevel2;

import java.util.LinkedHashMap;
import java.util.Map;

public class 캐시1차{

}

class 캐시1차Solution1 {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;

		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>(cacheSize, 0.75f, true){
	        @Override
	        public boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
	            return size() > cacheSize;
	        }
	    };
	    
	    for (String city : cities) {
	    	String input = city.toLowerCase();
	    	answer = lhm.containsKey(input) ? answer +1 : answer +5;
	    	lhm.put(input, 0);
//	    	lhm.forEach((k,v) -> System.out.print(k + ", "));
//	    	System.out.println();
		}
	    return answer;
	}
}