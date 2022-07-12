package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map 컬렉션 : 키와 값으로 구성
 */
public class HashMapExample {
	public static void main(String[] args) {
		// 학생이름 점수 (키,값)
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("홍길동", 80);
		map.put("김민수", 85);
		map.put("최기동", 92);
		map.put("홍길동", 89);		// 키가 동일한 값이면 val를 새로운 값으로 변경 80->89
		
		int score = map.get("홍길동");		// 값을 얻으려고 키를 get(키) 사용.
		System.out.println(score);
		
		map.remove("홍길동");
		
		// 반복요소
		Set<String> keySet = map.keySet();				// 키 => 새로운 set컬렉션에 담아줌
		
		// 확장 for get key만 가져와서 
		for(String key : keySet) {
			Integer val = map.get(key);
			System.out.println("키:" + key + " 값:" + val);
		}
		
		
		// 키 값 => entrySet()
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		// 확장 for	get key, get val 
		for(Entry<String, Integer> ent : entrySet) {
			String key = ent.getKey();					// 키에 해당 값
			Integer val = ent.getValue();				// 값
			System.out.println("키:" + " 값:" + val);
		}
		
		
	}

}
