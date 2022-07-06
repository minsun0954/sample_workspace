package co.edu.reference;

public class Example01 {

	public static void main(String[] args) {
	// 1 ~100수를 출력
	// i가 짝수일 때 sum
		
		int sum = 0;
			for(int i = 1 ; i<=100; i++) {
				if(i%2 == 0);{
				sum+=i;
				}
		}System.out.println(sum);
		

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
		
		

		
		
		
		
		
		
	}

}
