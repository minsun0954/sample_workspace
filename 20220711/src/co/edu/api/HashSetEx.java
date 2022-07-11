package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {			// 13장

	public static void main(String[] args) {
		// 데이터 저장 => 배열
		// 컬렉션 ArrayList => 인덱스 값으로 지장, 동일한 값 다른 인덱스 저장가능
		// 컬렉션 HashSet => 인덱스 값으로 지장하지 않고 동일한 값 저장못함
	
		HashSet<String> set = new HashSet<String>();		// 2 HashSet 중복값 저장 X
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		
		System.out.println(set.size()); 			
		Iterator<String> iter =  set.iterator();
		while(iter.hasNext()) {								// hasNext: 컬렉션에서 가지고 올 요소 체크
			System.out.println(iter.next());				// next: 요소 선택
			
		}
		
		System.out.println("====ArrayList====");
			
		ArrayList<String> list = new ArrayList<String>();	// 3 ArrayList 중복값 저장O
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");
		
		System.out.println(list.size()); 		
		for ( int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
