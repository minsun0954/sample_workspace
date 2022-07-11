package sec01;
/*
 * 문자열 포함 여부 조사
 */
public class StringIndexofExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");		// indexOf() : 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
		System.out.println(location);					// 자바 프로그래밍  프 => 3
		
		if(subject.indexOf("자바") != -1) {				// 0 != -1 이면 
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
	}

}
