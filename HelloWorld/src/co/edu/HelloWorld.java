package co.edu;

public class HelloWorld {
	public static void main(String[] args) {
		// 변수의 종류 : int(정수형) double(실수형) boolean(논리값) String(문자열) 
		// int(4byte) double(8byte)
		// 정수 : short(1byte) < short(2byte) < int(4byte) < long(8byte)
		
		String name = "정민선";
						 
						 // 두 단어 조합시 두번 째 단어 첫 글자 대문자 my Age => myAge 
		int myAge = 20;  // 선언하면서 값을 할당 => 초기화.
		int yourAge;     // 선언 : 초기화(x)
		yourAge = 22;    // 선언 후 값을 할당
		double height = 162.4;
		boolean isMarried = true;
		String myAddress = "대구시";
		
		myAge = 30;
		height = 165.2;
		
		int result = myAge + yourAge;  // 변수는 사용을 위해서 값이 할당.
		
		double result1 = (double) myAge + height;   // 연산 계산 시 변수의 종류가 같아야함, 정수 + 실수형 => 더 큰 실수형으로 타입을 바꾸고 계산     
		
		System.out.println(result);
		
				
		System.out.println("안녕하세요 " + name + " 입니다.");
		
	}
}
 