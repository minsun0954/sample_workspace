package home_forEx;

import java.util.Scanner;

public class home_for_07 {

	public static void main(String[] args) {
//	문제) 정수를 입력받아 입력받은 정수부터 100까지의 합을 출력하는 프로그램 (100이하 정수만 입력받는다 가정)
//	입력예) 95 출력예) 585
// 
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int i = 0; int sum = 0;
		i = num;
	
		 for( i = num; i <= 100; i++) {
			 sum = sum + i;
			
		 } System.out.println(sum); 
		 
			
	

	}

}
