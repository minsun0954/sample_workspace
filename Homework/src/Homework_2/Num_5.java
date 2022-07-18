package Homework_2;
//문제 5) 다음과 같이 두 개의 정수가 주어졌을 경우 
//		두 정 수 중에서 음수가 있다면 'One of a or b is negative number'를,
//		만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요. */ 

public class Num_5 {
	public static void main(String[] args) {

		int a = 10;
		int b = -8;
		
		String strResult =  (a * b < 0) ? "One of a or b is negative number" : "both a and b are zero or more";
		System.out.println(strResult);
		
	}

}
