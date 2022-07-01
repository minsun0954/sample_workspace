package co.edu;

import java.io.IOException;

/*
 * 
 */
public class Example04 {
	public static void main(String[] args) {
	
		System.out.println("값을 입력하세요.");
		
		int num = 10;
		boolean run = true;
		while(run) {
			int result = 0;
			
			try {
				result = System.in.read();
				System.out.printf("입력값은 %d 입니다.", result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			run = result != 48;
		}
		System.out.println("end of prog");
		
		
		
	}
}
