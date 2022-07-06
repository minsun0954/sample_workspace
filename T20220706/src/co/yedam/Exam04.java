package co.yedam;

/*
 * 문제 4: 임의의 값 생성.
 * Math.random()을 사용하여 1 ~ 100 의 임의의 값을 생성하여 배열(크기 6)에 저장 후
 * 가장 큰 값과 가장 작은 값을 구해서 출력하는 기능을 작성하세요.
 * 출력 예 : 가장 큰 값 : 97, 가장 작은 값 : 3
 */
public class Exam04 {
	public static void main(String[] args) {

		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		int num4 = (int)(Math.random()*100)+1;
		int num5 = (int)(Math.random()*100)+1;
		int num6 = (int)(Math.random()*100)+1;
		
		int[] intArray = {num1, num2, num3, num4, num5, num6};
		int max = 0;
		int min = 101;
		
		for( int i = 0; i < intArray.length; i++) {
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		for ( int i = 0; i < intArray.length; i++) {
			if(intArray[i] < min);
				min = intArray[i];
		}
		System.out.println("가장 큰 값 : "+ max+ ", 가장 작은 값 : " + min);
		
		
	}
}
