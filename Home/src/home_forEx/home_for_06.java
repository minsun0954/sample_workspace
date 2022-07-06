package home_forEx;

import java.util.Scanner;

public class home_for_06 {

	public static void main(String[] args) {
//	문제) 정수를 입력받아 1부터 입력받은 수까지의 합을 출력하는 프로그램
//	입력예) 10 출력예) 55
	
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum =0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}System.out.println(sum);
		
		
	}

}
