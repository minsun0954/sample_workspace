package co.edu;

public class BitOperator {
	public static void main(String[] args) {

		// 비트 연산자 : ~ 비트값을 반전 (0->1 1->0)
		int num = 10;
		int result = ~num;
		System.out.println(result);
		// 십진수10 이진수00001010 -> 십진수 -11 이진수 11110101
		
		result++;
		System.out.println(result); // -10
		
		// 대입 연산자 : = += -= *= /= .....
		String names = "홍길동";
		names = names + " 김민수";
		System.out.println(names); // 홍길동 김민수
		
		names += " 박의식";		   // += 변수=변수+피연산자
		System.out.println(names); // 홍길동 김민수 박의식
		 
		result = result-2; 
		result -= 2;
		System.out.println(result);
		
	}

}
