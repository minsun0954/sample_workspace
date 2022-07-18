package Homework_1;

/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
    출력예시) int a = 10; 의 경우 "10, int"로 출력. */

public class Num_3 {
	public static void main(String[] args) {
//		byte var1 = 128;
//		char var2 = "B";
//		String var3 = 44032;
//		int var4 = 100000000000;
//		float var5 = 43.93106;
//		long var6 = 301.3;
		
		int var1 = 128;
		System.out.printf("%d, int\n" , var1);
		
		String var2 = "B";
		System.out.printf("%s, Sting\n" , var2);
		
		int var3 = 44032;
		System.out.printf("%d, int\n" , var3);
		
		long var4 = 100000000000L;
		System.out.printf("%d, long\n" , var4);
		
		double var5 = 43.93106;
		System.out.printf("%.5f, double\n" , var5);
		
		float var6 = 301.3f;
		System.out.printf("%.1f, float\n" , var6);
		
		
		
	}

}
