package co.edu;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("임의 숫자 입력>> ");
		int num1 = scanner.nextInt();
		
		// 임의의 값이 3의 배수 => 입력 6은 3의 배수입니다.
		
		if( num1 % 3 == 0 ) {
		 System.out.println("입력" + num1 + "은 3의 배수입니다." );
		}else {
		 System.out.println("입력" +num1 + "은 3의 배수가 아닙니다.");
		}
		
		boolean is3Times = num1 % 3 == 0;
		if (is3Times) {
			 System.out.printf("입력%d은 3의 배수입니다." , num1);
		}else {
		 System.out.printf("입력%d은 3의 배수가 아닙니다.", num1);
		}
	

		
	
	
	
	
	
	}

}
