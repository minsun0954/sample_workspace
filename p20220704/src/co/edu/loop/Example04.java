package co.edu.loop;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// while 반복문의 종료조건
		// 1~100 임의의 수를 생성
		Scanner scanner = new Scanner(System.in);
		
		boolean isTrue = true;
		int temp = (int)(Math.random()*100)+1; 
		int inputVal = scanner.nextInt();
		
		while(isTrue) {
			System.out.println("숫자를 입력하세요. ");
			if(inputVal == temp) {
				System.out.println("맞췄습니다.");
				break;										// 맞추면 break문을 통해 while문 나오기
			}else if (inputVal > temp) {
				System.out.println("더 작은 수 입니다. ");
				inputVal = scanner.nextInt();				// 틀리면 다시 입력할 코드 만들어주기
			}else if (inputVal < temp) {
				System.out.println("더 큰 수 입니다. ");
				inputVal = scanner.nextInt();
			}
		}
		System.out.println("end of prog. ");
		
		
		
		
		
		

	}

}
