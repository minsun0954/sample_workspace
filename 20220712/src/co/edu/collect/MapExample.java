package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


/*/
 * 학생 이름 점수 => map저장
 * 김민수 80 / 황현익 75 / 이현승 88 / 
 * 
 */
public class MapExample {
	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap<String,Integer>();
	map.put("김민수", 80);
	map.put("황현익", 75);
	map.put("이현승", 88);
	
	
	// 평균점수: 최고점수: 최고점수의 학생이름:
	double avg = 0;
	int sum = 0;
	int max = 0;
	String sName = "null";
	
	Set<Entry<String,Integer>> entrySet = map.entrySet();
	
	for(Entry<String,Integer> ent : entrySet) {
			sum += ent.getValue();
			avg = (double)sum /map.size();
		
	}System.out.println("합계: " + sum + "평균점수: " + avg);
	
		
	for(Entry<String,Integer> ent : entrySet) {
			if(ent.getValue() > max) {
				sName = ent.getKey();
				max = ent.getValue();		
		}
		
	}System.out.println("최고점수: " + max + "최고 점수의 학생이름: "+ sName);
	
	
	
	
//	// Scanner 클래스 입력 > 학생 이름입력 => 학생 점수 반환
//	Scanner scn = new Scanner(System.in);
//	System.out.print("학생의 이름 입력> ");
//	String name =scn.nextLine();
//	
//	Set<Entry<String,Integer>> entrySet = map.entrySet();
//	 
//	
//	for(Entry<String, Integer> ent : entrySet) {
//		if(ent.getKey().equals(name)) {
//			System.out.println("학생의 점수:" + ent.getValue());
//		}
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}