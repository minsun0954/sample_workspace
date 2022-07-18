package Homework_1;
// 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.

public class Num_4 {
	public static void main(String[] args) {
	
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
		long result1 = a + c + d;
		System.out.println(result1);
		
		int result2 = a + b + c;
		System.out.println(result2);
		
		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);	
		
		
	}

}
