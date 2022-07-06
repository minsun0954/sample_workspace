package home_forEx;

import java.util.Scanner;

public class home_for_03 {
	public static void main(String[] args) {
//문제) 10이하의 정수를 입력받아 정수만큼 "JAVA 프로그래밍" 이라고 출력하는 프로그램
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	
	if(num>0 && num <11) {
		for(int i = 1; i <= num; i++) {
			System.out.println("JAVA 프로그래밍");
		}
	}else{
		System.out.println("잘못된 입력 값입니다. ");
	}

	
		
	}
}
