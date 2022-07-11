package co.edu.exception;

public class ThrowExceptionEx2 {
	public static void main(String[] args) {

		String[] str = {"100","200", "300", "400"};
		
		
	try{
		subMethod(str);
	}catch (NumberFormatException e) {
		System.out.println("예외종류: NumberFormat 예외");
	}catch (ArrayIndexOutOfBoundsException e1) {
		System.out.println("예외종류: 배열의 범위 초과 예외");
	}catch (Exception e2) {
		System.out.println("그외 예외: 알 수 없는 예외");
	}finally {											// finally 정상 or 예외 발생 => 반드시 실행할 코드
	System.out.println("프로그램의 정상 종료");
	}
	System.out.println("프로그램 종료");
}
	
	
	public static void subMethod(String[] strAry) throws NumberFormatException, ArrayIndexOutOfBoundsException  {
		for(int i = 0; i<5; i++) {							
			int num = Integer.parseInt(strAry[i]);
			System.out.println(num);
		}
	}
	
}
