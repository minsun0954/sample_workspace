package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();		//  <String> = <String> 형변환캐스팅 안해줘도 됨 
 		list.add("사과");
		list.add("100");
		
		for(int i =0; i < list.size(); i++) {
			String result = list.get(i);						// (String)list.get(i);
			System.out.println(result);
			
		}
		
		
		// List 컬렉션. List (인터페이스) => ArrayList, LinkedList, Vector
		List<String> sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("김민기");
		
		String result = sList.get(1);			// 인덱스 값 읽어올 때 	인덱스1 김민기
		sList.remove(0);						// 인덱스 값 삭제		인덱스0 홍길동 삭제
		
		sList.set(0, "황길동");					// 값 바꿈			인덱스0 황길동
		
		Iterator<String> iter = sList.iterator();						// 반복자 생성
		while(iter.hasNext()) {					// hasNext 요소의 존재여부 체크 
			String val = iter.next();			// 요소를 가지고 오는 메소드
			System.out.println(val);
		}
		
		
		
		// 인덱스 기반으로 요소 저장
		for(int i = 0; i< sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		//확장 for구문
		for(String val : sList) {
			System.out.println(val);
		}
		
		
	}

}
