package co.edu.reference;

public class ArrayExample02 {

	public static void main(String[] args) {
		
		int[] intAry = {20,27,15,33,29};		// 배열의 크기 5, intAry.length 배열의 길이 
		for (int i =0; i < intAry.length; i++) {
			if( i%2 == 0) {						// 인덱스 짝수
			//if(intAry[i]%2 == 0)				// 값 짝수
				System.out.println(intAry[i]);
			}
		}
		
		int i = 0;
		// 3번째 위치 15 => 30
		intAry[2] = 30;
		System.out.println(intAry[2]);
		
		
		// 1번째 위치 <=> 2번째 위치
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
		for (i =0; i < intAry.length; i++) {
				System.out.println(intAry[i]);
			}
		
		
		
		
		
		
		
		//int sum = 0;
		//for(int i2 = 0; i< intAry.length; i2++) {
		
		
		
		
		
		
		
	}
}

