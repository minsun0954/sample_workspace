package co.edu.collect;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();	//LIFO 후입선출
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
												// .pop() 맨위 객체 출력 후 제거 / .peek() 맨위 객체 출력			
		String elem = stack.pop();				// 맨 위의 객체 =>박찬호 출력 제거	
		System.out.println(elem);
		
		elem = stack.pop();
		System.out.println(elem);				// 맨 위의 객체 => 김인수 출력 제거
	
		elem = stack.pop();						
		System.out.println(elem);				// 맨 위의 객체 => 홍길동 출력 제거
		
		if(stack.isEmpty()) {
			System.out.println("스택에 더 요소가 없음.");
		}
	
	
	}

}
