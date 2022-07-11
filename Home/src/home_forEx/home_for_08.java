package home_forEx;

import java.util.Scanner;

public class home_for_08 {
	public static void main(String[] args) {
//	문제) 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램
//	입력예) 15 22 3 129 66 81 35 1 46 888 출력예) 입력받은 짝수는 4개입니다.
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@틀림
		
		
		Scanner scn = new Scanner(System.in);

		int cnt = 0;

		for( int i=1; i<=10; i++) {
			int num = scn.nextInt();					// 스캐너 입력 받는게 for문 안에 있어야 
			if(num%2==0) {						// 여러 숫자 입력받기 가능 for문 밖이면 하나의 숫자만 입력 가능!	
				cnt++;
			}
		}

		System.out.printf("입력받은 짝수는 %d개입니다.", cnt);

		
	}

}
