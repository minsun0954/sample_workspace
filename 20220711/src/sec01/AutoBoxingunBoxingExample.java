package sec01;
/*
 * p501
 */
public class AutoBoxingunBoxingExample {

	public static void main(String[] args) {
		
		// 자동박싱
		Integer obj = 100;
		System.out.println("Value: " + obj.intValue());
	
		// 대입 시 자동 언박싱
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
