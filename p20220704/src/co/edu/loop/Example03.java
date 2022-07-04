package co.edu.loop;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// sum의 누적값이 100를 초과할 때 반복문 종료				다시 확인해보기
	boolean isTrue = true;
	int sum = 0;
	
	do {
		System.out.println("임의의 값을 입력>> ");
		int num = scanner.nextInt();
		sum += num;
		if (sum > 100) {
			System.out.println("반복문을 종료합니다. ");
			isTrue =false;
		}
	
	} while (isTrue);
	
	System.out.println("sum의 누적값: " + sum);
	System.out.println("end of prog. ");
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
