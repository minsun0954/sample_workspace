package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>();			// Queue 선입선출

		que.offer("홍길동");
		que.offer("김민수");
		que.offer("황순호");
		
		while(!que.isEmpty()) {							// .poll() 맨위 객체 출력 후 제거 / .peek() 맨위 객체 출력	
			String result = que.poll();			
			System.out.println(result);
		}
	
	
	
	
	}

}
