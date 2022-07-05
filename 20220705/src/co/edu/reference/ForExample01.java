package co.edu.reference;

public class ForExample01 {

	public static void main(String[] args) {
		
		// 배열
		int[] tempAry = new int[5];
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int)(Math.random()*50);
		}	// 배열에 랜덤의 숫자 담아주기
		
		
		for (int num: tempAry) {
			System.out.println(num);
		}	// 만든 배열 출력하기
		
		
		// 배열 중에 제일 큰 값 max
		int max = 0;
		for(int i = 0; i < tempAry.length; i++) {
			
			if( max < tempAry[i] ) {
				max = tempAry[i];
			}
		}System.out.println("제일 큰 값: " + max);	
		
		
		
		
		
		
	}

}
