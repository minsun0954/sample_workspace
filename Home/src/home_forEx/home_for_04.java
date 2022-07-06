package home_forEx;

public class home_for_04 {
	public static void main(String[] args) {
//	문제) 대문자를 'A'부터 'Z'까지 출력하는 프로그램
//	(for문으로 char타입변수 1개만 사용)출력예) ABCDEFGHIJKLMNOPQRSTUVWXYZ
//  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@틀림
		
		int i;
		char a = 'A';

		for (i = a; i <= 'Z'; i++) {
			System.out.printf("%c", i);
		}

	}

}
