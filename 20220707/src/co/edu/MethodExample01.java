package co.edu;
/*
 * 메소드 연습용
 * 입력값(매개변수) 출력값(반환값)
 */
public class MethodExample01 {
	public static void main(String[] args) {
		sum(10,20);
		
		int result = sum2(5,10);
		System.out.println("결과 값은 " + result);
		
		result = sum2(sum2(3,5), sum2(5,7));
		System.out.println("결과 값은 " + result);
		
		double weight = properWeight(170);
		System.out.println("적정 몸무게는 " + weight);
		
		double area = getTriangle(23.4, 12.2);
		System.out.println("삼각형의 넓이는 "+ area);
	}	
	
	// 메소드 : 입력값 -> 처리 -> 출력값
	// void 반환결과 값 없음
	public static void sum(int n1, int n2) {
		int result = n1*2 + n2 * 3;
		System.out.println("결과: " + result);
	}
	/// void x 반환결과 값 없음	
	public static int sum2(int n1, int n2) {
		int result = n1 * 2 + n2 +3;
		return result; 		//sum2메소드를 호출한 영역으로 결과 반환
	}
		
	// 키 입력 - 처리 - 적정 몸무게 반환 (키-100) * 0.9
	
	public static double properWeight (double height){
		double weight = (height-100)*0.9;
		return weight;
	}
	
	// 삼각형의 넓이 메소드 ( 밑변, 높이) => 넓이 반환 밑변23.4 높이12.2
	public static double getTriangle (double a, double height ) {
		double area = (a*height/2);
		return area;
	}
	

}
