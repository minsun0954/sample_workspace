package home_forEx;

import java.util.Scanner;

public class home_for_09 {

	public static void main(String[] args) {
//	문제) 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
//	입력예) 10 15 36 99 100 19 46 88 87 13 출력예) 3의 배수 : 4    5의 배수 : 3
	
		Scanner scn = new Scanner(System.in);
		
		int count3 = 0;
		int count5 = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			int num = scn.nextInt();
			
			if(num%3 == 0) {
				count3++;
			}if(num%5 == 0) {
				count5++;
			}
		}
		System.out.println("3의 배수: " + count3 + " 5의 배수: " + count5 );
		
		
		
		
	}

}
