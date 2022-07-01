package co.edu;

public class Example02 {
	public static void main(String[] args) {
		// 나의 키:번수 친구 키:변수
		// 나의 키가 더 큽니다.
		// 나의 키가 더 작습니다.
		
		
		double myHeight = 170.4;
		double yourHeight = 160.5;
		boolean isTrue;
		
		isTrue =  myHeight > yourHeight;
			
		if (isTrue) {
			System.out.println("나의 키가 더 큽니다.");
		}else {
			System.out.println("나의 키가 더 작습니다.");
		}
			
		
		double theDifference = 0;  // 키 차이 (큰 수에서 작은 수를 빼기)
		
		
		if ( myHeight > yourHeight ) {
			theDifference = myHeight - yourHeight;
			System.out.println("나의 키가 " + theDifference + "만큼 더 큽니다.");
		}else {
			theDifference = yourHeight - myHeight;
			System.out.println("나의 키가" + theDifference + "더 작습니다.");
			
			
			
		}

	
	
	
	}
		
		
}

