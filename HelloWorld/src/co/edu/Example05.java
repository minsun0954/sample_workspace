package co.edu;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		
		// String name = new String("홍길동");
		System.out.println("값을 입력.");
		
		Scanner sn = new Scanner(System.in);
		
		// sn.nextLine();		// 문자열 입력
		// sn.nextInt();		// 정수 입력
		//String input = sn.nextLine();
		//int input = sn.nextInt();
		//System.out.printf("입력 값은 %s", input);
		//System.out.printf("입력 값은 %d", input);
		
		//System.out.println("첫번째 값을 입력.");
		//int num1 = sn.nextInt();
	
		//System.out.println("두번째 값을 입력.");
		//int num2 = sn.nextInt();
		
		//int result = num1 + num2;   // 입력한 두 수의 합
		//System.out.printf("입력 값 %d와 %d의 합은 %d입니다.\n", num1, num2, result);		// 입력 값 a와 b의 합은 c입니다.
		
		System.out.println("첫번째 값을 입력.");
		int num1 = sn.nextInt();
	
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		
		int result =0;
		if(num1 > num2) {
			result = num1 - num2;
			System.out.printf("입력 값 %d와 %d의 차이는 %d입니다.\n", num1, num2, result);
		}else {
			result = num2 - num1;
			System.out.printf("입력 값 %d와 %d의 차이는 %d입니다. \n", num2, num1, result);
		}
			
			
		
	
		
		
		
	}

}
