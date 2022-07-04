package co.edu;

import java.util.Scanner;

public class OperatorExample {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		Scanner scanner = new Scanner(System.in);
		
		int result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2;
		result = num1 / num2;
		result = num1 % num2;	// 나머지 연산자
		
		result = num1 % 2; // 홀수, 짝수
		
		// System.out.println("임의의 값을 입력: ");
		// num1 =scanner. nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다. ");
		}
		
		result = (20 + 2) * 3;
		System.out.println(result);

		num1++; // num2 = num + 1; 1을 증가시킨다는 의미 11
		System.out.println(num1);
		num1--; // num2 = num - 1; 1을 감소시킨다는 의미 10
		System.out.println(num1);
	
		System.out.println(++num1); // 11
		// ++num; 다른 연산을 수행하기 전에 피연산자의 값을 1 증가시킴
		// num++; 다른 연산을 수행한 후에 피연산자의 값을 1 증가시킴
		
		//result = num1++ + num2;
		//System.out.println(result); // 11+20=31 num1=12
	  
		result = ++num1 + ++num2;
		System.out.println(result); // 11+20=31 num1=12 num2=21
	
		result = num1 + num2;
		System.out.println(result); // 12+21=33
		
		//논리부정연산자 : !
		// if (result % 2 == 0) { // result 값이 짝수인가 홀수인가
		boolean isEven = result % 2 == 0;
		if (!isEven) {	
			System.out.println("결과값이 홀수입니다. ");
		}
		
		

		
	}
}
