
public class home_2변수 {

	public static void main(String[] args) {

		System.out.println("자바는");
		System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다.");
		
		// 자바는
		// \n 한줄 띄우기
		// 재미있는 "프로그래밍" 언어
		// \n 한줄 띄우기
		// 입니다. 
		
		boolean stop = false;
		if(stop) {
			System.out.println("멈춥니다.");
		}else {
			System.out.println("출발합니다.");
			}
			
		// 출발합니다.
		
		////2.3 타입 변환
		// 자동 변환 : 작은 범위 -> 큰 범위로 저장
		// 크기 순서 : byte < short < int < long < float < double
		// 연산 시 동일한 타입만 가능 아닐 경우 변환 후 연산 
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);	// intValue: 10
		// byte -> int 자동변환
		// inValue: 10
		
		// 강제 타입 변환 : 큰 범위 -> 작은 범위로 저장
		// 작은 허용 범위 = (작은 허용 범위)큰 허용 범위
		
		int intValue1 = 10;
		byte byteValue1 = (byte)intValue;	
		System.out.println("intValue1: " + intValue1);	// intValue1: 10
		// int -> byte 강제 변환
		
		double doubleValue = 3.14;
		int intValue2 = (int)doubleValue;
		System.out.println("intValue2: " + intValue2);	// intValue2: 3
		// double -> int 강제 변환
		// int는 정수형이기 때문에 3.14가 아닌 3으로 출력 소수점은 버려짐
		
		byte x = 10; byte y = 20;
		//byte result = x + y ;		// 오류 
		int result = x + y;
		System.out.println(result);
		// 오류 이유 : int보다 작은 byte, short의 연산은 int으로 자동 변환
		
		long lon = 10L; int it = 20;
		//int result1 = lon + it;	// 오류
		long result1 = lon = it;
		// 오류 이유 : int보다 long이 더 크기 때문에 연산 안됨 long으로 변환	
		
		
		int value4 = 1 + 2 + 3; 	 // 숫자 + 숫자 + 숫자 = 숫자 
		String str1 = 1 + 2 + "3"; 	 // 숫자 + 숫자 = 숫자3 + 문자열3 = 문자열33
		String str2 = 1 + "2" + 3;	 // 숫자 + 문자열 = 문자열12 + 숫자3 = 문자열123
		String str3 = "1" + 2 + 3 ;  // 문자열 + 숫자 = 문자열12 + 숫자3 = 문자열123
		System.out.println(value4);	 // 6
		System.out.println(str1);	 // 33
		System.out.println(str2);	 // 123
		System.out.println(str3); 	 // 123
		// -> 연산의 방향 ->
		
		String str0 = "10";
		int value0 = Integer.parseInt(str0);
		System.out.println(value0);
		// Integer.parseInt 문자열->숫자 강제변환
		// 문자열에 숫자만 있어야 가능, 알파벳 특수문자 한글 포함 되어 있을 경우 오류
		
		char c1 = 'a'; 
		char c2 =(char)(c1+1) ;
		System.out.println(c2);
		
		int a = 5; int b = 2;
		double result7 = (double)a/(double)b;
		System.out.println(result7);
		
		double var6 = 3.5;
		double var7 = 2.7;
		int result8 = (int)var6 + (int)var7;
		System.out.println(result8);
		
		long var8 = 2L;
		float var9 = 1.8f;
		double var10 = 2.5;
		String var11 = "3.9";
		int result9 = (int)var8 + (int)(var9 +var10) + (int)Double.parseDouble(var11);
		System.out.println(result9);
				
				
		
		
	}

}
