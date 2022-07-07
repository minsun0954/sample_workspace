package co.edu;
/*
 * 상수 vs 변수
 * 변수에 final이 붙으면 상수
 * 메소드에 final이 붙으면 재정의(overriding) 불가
 * 클래스에 final이 붙이면 상속이 불가
 * 
 * 클래스 선언은 파일 하나에 하나 작성이 원칙이나 여러개 사용 가능
 */
class Person{
	final String ssn; // 주민번호.
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}	
}
public class FinalExample {
	public static void main(String[] args) {
	
		// 변수
		String name = "홍길동";
		name = "김민수";				// 새로운 값 할당 가능
		
		
		// 상수
		final int num = 10;
		// num =20; 				// 오류 => 새로운 값 할당 불가능 
	
		Person person = new Person("970503-1234567" , "홍길동");
		person.name = "홍민수";
		// person.ssn = "970504-1234567";		// Person클래스에 final String ssn; final 지정해서 수정 불가능
	
	}
	
	
}
