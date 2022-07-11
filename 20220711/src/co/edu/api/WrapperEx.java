package co.edu.api;

import java.util.ArrayList;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100");
		System.out.println(i);
		
		int i2 = 100;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);			// 100(int) => 100(Integer) 박싱
		list.add(200);
		list.add(new Integer(300));		// deprecated 된거 차후 사용중지
	
		for(Integer num : list) {				// num이라는 변수에 담아 
			System.out.println(num);
			
		}
		
		int n1 = Integer.parseInt("1000");				// 문자열 => 숫자
		double n2 = Double.parseDouble("23.3");
	}

}
