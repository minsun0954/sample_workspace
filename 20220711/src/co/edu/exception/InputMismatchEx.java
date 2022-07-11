package co.edu.exception;

import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);	
				
		try{
		System.out.println("숫자를 입력하세요.");
		int num = scn.nextInt();
		System.out.println("입력값: " + num);
			
		}catch(NumberFormatException e1){
			System.out.println("잘못된 값 입력됨.");
		}
		System.out.println("프로그램 종료. ");
					
	
	}

}
