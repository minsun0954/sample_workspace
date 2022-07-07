package co.edu;

public class StaticMain {

	public static void main(String[] args) {
		// 정적 기능 static
//		Calculator cal = new Calculator();		// 객체 생성하지 않고 사용 가능
//		System.out.println(cal.pi);
		
		System.out.println(Calculator.pi); 
		int result = Calculator.sum(10, 20); 
		
		Math.random();
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);
	}

}
