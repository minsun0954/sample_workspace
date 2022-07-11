package sec01;
/*
 * p500
 */
public class BoxingUnBoxingExample {

	public static void main(String[] args) {

		Integer obj1 = new Integer(100);		// int => int 박싱
		Integer obj2 = new Integer("200");		// int => 문자열 박싱
		Integer obj3 = Integer.valueOf("300");	// int => int 생성자 없이 정적메소드 사용해서 박싱

		int value1 = obj1.intValue();			// 언박싱
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}

}
