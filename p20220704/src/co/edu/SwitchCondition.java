package co.edu;

public class SwitchCondition {

	public static void main(String[] args) {
		
		//  0.0 <= Math.random() < 1.0  // 
		//  0.0 <= Math.random() *10 < 10.0
 	    //  0 <= (int)Math.random()*10 < 10; 
		//  1 <= (int)(Math.random()*10)+1 < 11;
	
		
		int result = (int)(Math.random()*6) + 1;
		
		if(result == 1 ) {
			System.out.println("1번 출력.");
		} else if (result ==2 ) {
			System.out.println("2번 출력.");
		}else if (result ==3 ) {
			System.out.println("3번 출력.");
		}else if (result ==4 ) {
			System.out.println("4번 출력.");
		}else if (result ==5 ) {
			System.out.println("5번 출력.");
		}else if (result ==6 ) {
			System.out.println("6번 출력.");
		}
		
		
		//switch
		switch(result) {
		case 1:
			System.out.println("1번 출력."); break;
		case 2:
			System.out.println("2번 출력."); break;
		case 3:
 			System.out.println("3번 출력."); break;
		case 4:
			System.out.println("4번 출력."); break;
		case 5:
			System.out.println("5번 출력."); break;
		case 6:
			System.out.println("6번 출력.");
		}
	
		
		
		
		
		
	}

}
