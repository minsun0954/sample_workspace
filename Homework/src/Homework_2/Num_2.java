package Homework_2;
//문제2) 아래와 같이 각 변수를 초기화하였을 때 다음 결과를 차례대로 false 와 true로 출력하도록 수정하세요.

		//System.out.println( ( m*2 == n*4 ) || ( n<=5 ) );		
		//System.out.println( ( m/2 > 5) && ( n%2 < 1) );
public class Num_2 {
	public static void main(String[] args) {

		int m = 10;
		int n = 5;
		
		System.out.println( !(( m*2 == n*4 ) || ( n<=5 )) );		
		System.out.println( !(( m/2 > 5) && ( n%2 < 1)) );
		
	}

}
