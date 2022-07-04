package co.edu;

public class CompareOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// ==, !=, >, >= <, <=
		
		if( num1 == num2 ) {
			System.out.println("두수 같습니다.");
		} 
		if( num1 != num2 ) {
			System.out.println("두수 다릅니다.");
		}
		
		num1 = 20; num2 = 20;
		if ( num1 >= num2 ) {
			System.out.println("num1이 num2 크거나 같습니다. ");
		}
		
		//클래스의 값을 비교 (String) 
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		System.out.println(name1 + "," + name2);
		
		if( name1 == name2 ) {
			System.out.println("두 값이 동일합니다. ");
		} else {
			System.out.println("두 값이 동일하지 않습니다. ");
		}
		// 두 값이 동일하지 않습니다. -> 문자열의 경우 비교 연산자로 비교하는 것이 아니라
		// equals()로 비교
		if( name1.equals(name2) ) {
			System.out.println("두 값이 동일합니다. ");
		} else {
			System.out.println("두 값이 동일하지 않습니다. ");
		}
		// 두 값이 동일합니다.
		
		// 삼항연산자 : 세 개의 피연산자를 필요로 하는 연산자
		boolean isTrue = false;
		if(num1 > num2 ) {
			isTrue = true;
		} else {
			isTrue = false;
		}
		
		isTrue = (num1 > num2) ? true : false;
		System.out.println(isTrue);
		
		String result =(name1.equals(name2)) ? "true" : "false";
		System.out.println(result);
		
	}

}
