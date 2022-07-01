package co.edu;

public class Example03 {
	public static void main(String[] args) {
		// 10+20 => "10"+"20" => "1020" ""는 문자열 의미
		System.out.println(10+20);
		System.out.println("10"+"20");
		
		// 내 이름은 "홍길동" 입니다.
		// String 홍길동 = "hong";
		System.out.println("내 이름은 \"홍길동\"  입니다.");		// 이스케이프문자 \" 문자열 식별 기호가 아닌 큰 따옴표로 사용할 때
		
		// {"name":"홍길동", "age":20} json데이터타입.
		System.out.println("{ \"name\": \"홍길동\",\"age\": 20 }");
	
		
		// Interger.ParseInt 문자열 -> 정수, 실수.
		int num1 = Integer.parseInt("100");
		double num2 = Double.parseDouble("127.99");
		double num3 = Double.parseDouble("122.01");
		
		
		double result = sum(num1,num2);
		result = minus(num2, num3);
		System.out.println("합결과: " + result);
		System.out.printf("차이는 %.2f 입니다\n", result);
		System.out.printf("저의 이름은 %s이고 나이는 %d 입니다.\n", "홍길동", 14);
		
		// 이름, 나이, 몸무게 변수 선언
			
		String name = "홍길동";
		int age = 16;
		double weight = 65.4;
		
		System.out.printf("나의 이름은 %s이고\n나이는 %d 이고\n몸무게는 %.1f 입니다.\n", name, age, weight);
		
		
	}
	
	
	// 2개의 숫자를 합한 결과를 반환. method. 메소드
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;		
	}
		
		
		
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;
	}


}
