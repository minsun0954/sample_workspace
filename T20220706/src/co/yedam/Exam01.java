package co.yedam;

/*
 * 문제1: 정수형 변수 num1, num2를 선언하세요.
 * 두변수에 각각 임의의 값을 저장을 한다면 두 수 중에서 큰수에서 작은 수를 뺀 결과를 result 변수에 대입하는 코드를 작성하세요.
 * 출력 예) 35 - 27 의 결과 8.
 */
public class Exam01 {
	public static void main(String[] args) {
		int num1 = 29;
		int num2 = 35;
		int result;
		
		if(num1 >= num2) {
			result = num1 - num2;
			System.out.println(result);
		}else {
			result = num2 - num1;
			System.out.println(result);
		}
		
		
		
		
		
	}
}
