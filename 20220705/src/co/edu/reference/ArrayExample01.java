package co.edu.reference;

public class ArrayExample01 {

	public static void main(String[] args) {
		// 배열의 저장공간 선언
		int[] intAry = new int[10];		// 저장공간 10개인 객체
		intAry[0] = 10;			// 첫번째 위치에 10 할당
		intAry[4] = 50;			// 다섯번째 위치에 50 할당
		
		System.out.println(intAry.length);	// 배열의 길이 10 new int[10] 
		
		System.out.println(intAry[4]);
		
		for(int i = 0; i<10; i++) {			// 0부터 9까지
			System.out.println(intAry[i]);
		}
		
		double[] dblAry = new double[5];	// double형 공간 5개 선언
		for(int i=0; i< dblAry.length; i++) {
			System.out.println(dblAry[i]);
		}
		
		boolean[] boolAry = new boolean[3];	// boolean형 공간 3개 선언 true false만 대입가능
		boolAry[1] = true;
		// boolAry[1] = "true";		// 안됨
		for(int i =0; i < boolAry.length; i++) {
			System.out.println(boolAry[i]);
		}
		
		String[] strAry = {"홍길동","김민수","허민기"}; // 배열 선언하면서 내용도 같이
		// strAry[3] = "황경영";		// 실행오류 인덱스012까지 있음 인덱스3은 없음 길이 추가 불가
		strAry[2] = "황경영";			// 인덱스2 황경영으로 수정은 가능
		for (int i =0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
		
		
		
	}

}
