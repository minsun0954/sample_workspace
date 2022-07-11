package co.edu.exception;
/*
 * 인스턴스 참조변수 = null
 */
public class NullpointerEx {

	public static void main(String[] args) {
				
		String name = "홍길동";
		name = null;
		
		try {
			System.out.println(name.toString());
			System.out.println("name의 값을 출력합니다.");
		
		}catch(NullPointerException e) {
			//System.out.println(e.getMessage());		
			e.printStackTrace();			// 어디서 오류난지 알려쥼	
		}
		System.out.println("프로그램 종료");
		
		
	}

}
