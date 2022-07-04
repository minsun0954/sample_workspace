package co.edu.loop;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("입력>> ");
			int inputVal = scanner.nextInt();
			System.out.println("입력값은 " + inputVal);
			
			if (inputVal == 9 ) {
				System.out.println("반복문을 종료합니다. ");
				isTrue = false;
				
			}
		} // end of while
		System.out.println("end of prog. "); 
		
		
		/*
		boolean isTrue = true;
		do { 
			System.out.println("입력>> ");
			int inputVal = scanner.nextInt();
			System.out.println("입력값은 " + inputVal);
		
			if (inputVal == 9 ) {
				System.out.println("반복문을 종료합니다. ");
				isTrue = false;
			}
		} while (isTrue);
		System.out.println("end of prog. "); */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
