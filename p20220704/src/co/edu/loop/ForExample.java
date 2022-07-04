package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {
	
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("i의 값: "+ i + ", sum의 값: " + sum);
		}
		System.out.println("결과값: "+ sum);
		
		// i값이 홀수만
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			if( i%2 == 1 ) {
			sum1 = sum1 + i;
			System.out.println("i의 값: "+ i + ", sum1의 값: " + sum1);
			}
		}		
		System.out.println("결과값: "+ sum1);
		
		// 1~10까지 홀수 result => 누적
		int result = 0;
		for(int i = 1; i <= 10; i++) {
			if( i%2 == 1 ) {
			result += i;
			System.out.println("1~10까지 누적 합: " + result);
			}	
		}
		
		// 1~10까지 1 4 7 10 result => 누적
		int result1 = 0;
		for(int i = 1; i <= 10; i+=3 ) {
			result1 += i;
			System.out.println("1~10까지 누적 합: " + result1);		
		}
	
		// 10~1까지 result => 누적
		int result2 = 0;
		for(int i = 10; i >= 1; i--) {				
			result2 += i;
			System.out.println("10~1까지 누적 합: " + result2);
	
		}		
		
		
		
		
		
		
		
	}

}
