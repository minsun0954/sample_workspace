import java.util.Scanner;

public class home_4조건문 {

	public static void main(String[] args) {
		//
		int score = 85;
		System.out.print("등급은 ");
		if (score < 70) {
			System.out.print("D");
		} else if (score < 80){
			System.out.print("C");
		} else if (score < 90){
			System.out.print("B");
		} else {
			System.out.print("A");
		}
		System.out.println("입니다.");		// 등급은 B입니다.
	
		// 
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'C';
		switch(grade) {
			case 'A' : System.out.println("VVIP 혜택을 받으실 수 있습니다. ");
			case 'B' : System.out.println("VIP 혜택을 받으실 수 있습니다. "); break;
			case 'C' : System.out.println("우수 회원 혜택을 받으실 수 있습니다. ");
			case 'D' : System.out.println("일반 회원 혜택을 받으실 수 있습니다. "); break;
			default : System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다. ");

		// for문을 이용해서 1부터 100까지 정수 중에서 3의 배수의 총합을 구하는 코드
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if( i%3 == 0 ) {
			sum += i; 
			}
		}
		System.out.println("3의 배수의합: " + sum);
		
		// while Math.random이용
		// 2개의 주사위를 던졌을 때 나오는 눈을 눈1 눈2 출력
		// 합이 5가 아니면 계속 던지고 합이 5면 멈추는 코드	
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println(num1 + "," + num2);
				if (num1 + num2 == 5) {
				break;
			}
		}
		
		// 중첩for문을 이용하여 방정식 4x+5y = 60의 모든 해를 구해서 (x,y)형태로 출력
		// x y는 10이하의 자연수
		for(int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4*x + 5*y == 60) {
			System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		
		// for문을 이용해서 
		
		
		// for문을 이용해서
		
		// while문과 Scanner를 이용
		// 1.예금 2.출금 3.조회 4.종료
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료. ");
			System.out.println("-----------------------------");
			System.out.println("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
			case 1:
				System.out.println("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.println("잔고액> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
		
			System.out.println();
			}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}
}
