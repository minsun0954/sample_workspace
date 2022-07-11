package home_forEx;

import java.util.Scanner;

public class home_for_11 {
	public static void main(String[] args) {
//	문제) 값을 입력받고 1부터 차례로 누적하여 합을 구하다가 합이 입력받은 수를 넘으면 중단하고 마지막으로 더해진 값과 그때까지의 합을 출력하는 프로그램 
//	입력예) 1000 출력예) 45 1035
//  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@틀림

		Scanner scn = new Scanner(System.in);
		
		int sum = 0;
		int num = scn.nextInt();
		int i = 0;
		
		for(i = 1; ; i++) {			
			if(sum>num) {								// 조건식을 안하고 if문에 넣음
				break;
				
			
			}sum += i;
			
			}System.out.print(i+" "+sum); 			// i-1 마지막으로 더해진 값

		
		
		
		
	}

}
