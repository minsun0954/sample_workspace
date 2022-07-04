package co.edu.loop;

public class Example01 {

	public static void main(String[] args) {
		// num 변수 <= 1 ~ 10 까지의 임의 정수. Math.random();
		// sum 변수 <= 2의 배수.
		// 10번 반복.
		
		//int num = (int)(Math.random()*10)+1;
		//int sum = 0;
		//for (int i = 1; i <=10; i++) {
		//	if(num%2 == 0) {
		//	sum = sum + i;
		//	System.out.println("2의 배수의 합: " + sum );
		//	}
		//}												// 나
		
		
		int num, sum;
		sum = 0;
		
		for (int i= 1; i <=10; i++) {
			num = (int)(Math.random()*10)+1;
			if (num % 2 == 0) {
				sum += num;
				System.out.println(num + "," + sum);
			}
		}												// 교수님
		System.out.println("2의 배수의 합: "+ sum);
		
		// 2의 배수 또는 3의 배수 둘 다 누적
		int num1, sum1;
		sum1 = 0;
		
		for (int i= 1; i <=10; i++) {
			num1 = (int)(Math.random()*10)+1;
			if (num1%2 == 0 || num1%3 == 0) {
				sum1 = sum1 + num1;
				System.out.println(num1 + "," + sum1);
			}
		}												
		System.out.println("2 또는 3의 배수 합: "+ sum1);
	
		// sum2: 2의 배수의 합계 / sum3: 3의 배수의 합계
		int num2, sum2, sum3;
		sum2 = 0; sum3 = 0;
		
		for (int i =1; i <=10; i++) {
			num2 = (int)(Math.random()*10)+1;
			if (num2%2 == 0){
				sum2 += num2;
			}if( num2%3 == 0) {
				sum3 += num2;
			}	
		}												// for문 끝나고 출력
		System.out.println("2의 배수의 합계: " + sum2);
		System.out.println("3의 배수의 합계: " + sum3);
			
		
		
		
		
		
	}
}
