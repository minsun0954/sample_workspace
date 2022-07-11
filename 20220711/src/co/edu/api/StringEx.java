package co.edu.api;

import java.io.UnsupportedEncodingException;

public class StringEx {

	public static void main(String[] args) {

		String name = "홍길동";
		
		char fName = name.charAt(0);									// 0번째 글자 출력 p487
		System.out.println(fName);
		
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};			// p485
		
	try {
		name = new String(bytes, 0,5, "UTF-8");				// 0부터 5까지 출력 , 인코딩방법
		}catch (UnsupportedEncodingException e) {
		e.printStackTrace();
		}
	System.out.println(name);	
		
	}

}
