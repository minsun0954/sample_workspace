package home_forEx;

import java.util.Scanner;

public class home_for_12 {

	public static void main(String[] args) {
//	문제) 정수 n을 입력받고 1부터 홀수를 차례대로 더해 나가면서 합이 n 이상이면 
//	그 떄까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램 
//	입력예) 100 출력예) 10 100 
//		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@틀림
	
		Scanner scn = new Scanner(System.in);
		
		int sum = 0;
		int num = scn.nextInt();
		int cun = 0;
		
		for(int i = 1; ; i+=2) {				//i 홀수만 i+=2
			if(num <= sum) {		
				break;	
			}
			sum += i;
			cun++;
			
		}System.out.println(cun); System.out.println(sum);
		
		
		
	}

}
