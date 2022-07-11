package co.edu.api;
/*
 * 반복되지 않는 수 구하기
 */
import java.util.HashSet;

public class BoxingUnboxingEx {
	public static void main(String[] args) {
		// 로또 번호 생성 1~45
		int[] lotto = new int[6];				// 중복 번호 생성 가능성 있음
		for(int i =0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		
		for(int j = 0; j < i; j++) {			// 현재 동일 한 값이 있는지 체크		
			
		}
	}
		
	for(int num : lotto) {
			System.out.println(num);
	}
	
	
	
	
	
	
	HashSet<Integer> set = new HashSet<Integer>();
	
	set.size();		//  1,2,3,3 => 사이즈 3 중복허용 안 함
	
	int cnt = set.size();
	while(cnt <= 6) {
		int temp = (int)(Math.random()*45)+1;
		set.add(temp);
		cnt = set.size();
		System.out.println(temp + "," + set.size());			// 중복된 값이 나오면 한번 더 랜덤 값 
		}
	
	
	
	
	}

}
