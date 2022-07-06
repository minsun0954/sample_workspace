package co.yedam;

import java.util.Scanner;

/*
 * 문제 3: 배열사용.
 * 정수(int)를 저장할 수 있는 배열(크기 3)을 선언하고 Scanner 클래스를 이용하여 사용자의 입력값을 저장 후
 * 저장 된 값중에서 가장 작은 값과 배열요소의 평균을 구하는 기능을 작성하세요.
 * 출력 예 : [5, 6, 7] 가장 작은 값: 5, 평균: 6.0
 */
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] intArray = new int[3];
		
//		intArray[0] = scn.nextInt();
//		intArray[1] = scn.nextInt();
//		intArray[2] = scn.nextInt();
		intArray =new int[] {scn.nextInt(),scn.nextInt(),scn.nextInt()};
		
		int min = 100;
		int max = 0;
		for(int i = 0; i < intArray.length; i++) {
			
			if(intArray[i] > max) {
				max = intArray[i];
				
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
			
		}
		float avg = ((max+min)/2);
		System.out.println("가장 큰 값: " + max);
		System.out.println("가장 작은 값: " + min);
		System.out.println("평균: " + avg);
		
		
		
		
	}
}
