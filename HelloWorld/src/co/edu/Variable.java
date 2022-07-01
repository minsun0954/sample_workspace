package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 127;			// -128 ~ 127 
		short s1 = 32700;   	// -32768 ~ 32767
		int n1 = 0;				// -2147483648 ~ 2147483647
		long l1 = 11111111L; 	// -923372036854775808 


		int result = b1 + 20;		    // byte + int => 연산 시 같은 타입 사용 => int result = int(b1) + 20
		long result1 = l1 + (long) 20; 	// 데이터타입 변환 : 자동형변환(promotion)
		result = (int)l1 + 20;  	    // 데이터타입 변환 : 강제형변환(casting)
		System.out.println(result);
		
		char c1 ='A'; 		// 문자 ' '
		// c1 = c1 + 1;		// 연산의 기본은 int타입이라서 오류남 
		c1++;				//
		for (int i = 0; i < 25; i++ ) {  	// 반복문 - 정수 0부터 25까지 증감
			System.out.println(c1++ );
		}
		
		
		//하이 2022.07.01 12:55z
		System.out.println("이력변경추가.");
		
		//깃에서 수정한 작업
		System.out.println("깃수정.");
		
		System.out.println("fdafasd.");
	
		System.out.println("fdafsdfsddsaasd.");
	
	
	}

}
