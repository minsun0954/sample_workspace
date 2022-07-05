package co.edu.reference;

public class MethodExample01 {
	public static void main(String[] args) {
		// 실행구문
		// long sum = sum(20); // arguments (매개값)
		//showInfo("홍길동", 20);
		//showInfo("이창호", 25);
		//printStar(7,"☆");
		printGugudan(1);
		
	}
	
	public static void printGugudan(int i) {
		
		for ( int j= 1; j <=9; j++) {
			for ( i = 1; i <=8; i++) {
				System.out.printf("%d * %d = %d\t",i , j,(j*i)); 
			}
		System.out.printf("%d * %d = %d\n",i , j,(j*i));
		}
	}
	
	
	public static void printStar(int times, String shape) {
		
		for (int i = 1; i <=times ; i++) {
		 for (int j = 1; j <= i; j++) {
		System.out.print(shape);	
		}System.out.println();
		}
	}
	
	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살 입니다.");
		
	}
	
	// 정의구문
	public static long sum(int num) { // parameter (매개변수)
		int result = num * 2;
		return result;		// 자동형변환
		
	}
}
