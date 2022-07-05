package co.edu.reference;

public class DataTypeExample02 {

	public static void main(String[] args) {
		// 기본데이터 타입 (byte short long int float double boolean)
		int num1 = 100;
		int num2 = 100;
		
		System.out.println( num1 == num2 ); 		// true
		
		// 참조데이터 타입 (String)
		String str1 = new String("홍길동");			// 홍길동 객체 주소 값
		String str2 = new String("홍길동");			// 홍길동 객체 주소 값
		
		System.out.println( str1 == str2 ); 		// false 변수의 주소 비교
		System.out.println( str1.equals(str2));		// true 값을 비교
		
		int result = 0; 		// int 초기화
		String str3 = null; 	// String 초기화 
		
		str1 = null;
		System.out.println( str1.equals(str2));	
		
		
		
	}

}
