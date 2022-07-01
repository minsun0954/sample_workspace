package co.edu;

public class Example01 {
	public static void main(String[] args) {
	
		
		int a = 20;
		int b = 10;
		
		System.out.println( "a+b는 = " + (a+b));
		System.out.println( "a-b는 = " + (a-b));
		
		int c = 2;
		double d = 2.56789;
		
		System.out.println( "a1+d1는 = " +(c+d));
		
		boolean isTrue = false;   // 논리형 false true 결과 값이 나옴
		
		int myAge = 10;
		int yourAge = 11;
		myAge = 13;
		
		isTrue = myAge > yourAge;
		if (isTrue) {
			System.out.println("나의 나이가 더 많다.");
		}else {
			System.out.println("나의 나이가 더 적다.");
		}
		
		// float double : double 기본 값
		float f1 = 23.4f;			// 4byte
		double d1 = 23.39439492;	// 8byte
		
		// 0 ~ 10 정수
		// 1 ~ 1 실수
		double result = 1.1+2.2;
		System.out.println(result);   // double이 좀 더 정확한 데이터 저장 가능
		
		//long(8byte) float(4byte)
		//long sum = 2345L + 22.3f; float가 더 커서 float로 변형
		float sum =2345L + 22.3f;
	}

}
