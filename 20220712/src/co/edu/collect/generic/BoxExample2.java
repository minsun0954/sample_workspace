package co.edu.collect.generic;

public class BoxExample2 {
	public static void main(String[] args) {		
		Box<String> box = new Box<String>();			// <String> String 타입으로 지정해둔거
		box.set("문자열");
		String result = box.get();
	 // Integer result2 = box.get();					// String 타입으로 지정했는데 int써서 오류
	
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100);								// int -> Integer (boxing)
		Integer result1 = intBox.get(); 
	}
}
