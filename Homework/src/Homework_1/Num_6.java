package Homework_1;

/* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */

public class Num_6 {
	public static void main(String[] args) {

		int value = 485;
		int sum = 0;
		
		for(int i = 1 ; i < 4; i++) {
			sum += value%10;	
			value = value/10;
		}
		System.out.println( "결과는 " + sum + "입니다. ");
		
		value = 485;
		int a = value/100;
		int b = (value-(value/100*100))/10;
		int c =(value%100)%10;
		int result = a+b+c;
		System.out.println(value + "일 경우 " + a + "+" + b + "+" + c + "=" + result + " 입니다.");
		
		
	}

}
