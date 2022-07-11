package home_forEx;

import java.util.Scanner;

public class home_for_10 {
	public static void main(String[] args) {
//	문제) 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램
//	평균은 소수 첫째자리까지 출력. 입력예) 90 85 100 66 88출력예) 총점 : 429          평균 : 85.8
	

		Scanner scn = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 5; i++) {				// 입력하는거 for문 안에 있기!! 까먹지말기
			int num = scn.nextInt();
			sum = sum + num;
			count++;
		}
		double avg = (double)sum / count ;
		System.out.println(count);
		System.out.printf("총점 : %d 평균 %.1f" ,  sum , avg );
		
		
		
	}

}
