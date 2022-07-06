package co.edu.reference;

import java.util.Scanner;

public class MorningEx {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;			// 학생수
		int[] scores = null;		// 참조변수 초기화
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>> ");
			
			int selectNum = Integer.parseInt(scanner.nextLine());
			
			
			 if ( scores == null ) {		// scores==null 안해주면 안됨
				if (!(selectNum == 1 || selectNum == 5)) {
				System.out.println("학생수를 먼저 선택해주세요. ");
				continue;
				}
			}
			
			if( selectNum == 1 ) {
				System.out.print("학생수 입력>>> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다. ");
			
				}else if ( selectNum == 2 ) {
					System.out.println("점수 입력>>> ");
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i +"]> ");
						scores[i] = Integer.parseInt(scanner.nextLine());
					}
				}else if ( selectNum == 3 ){
					System.out.println("점수리스트>>> ");
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i +"]> " + scores[i]);
					}
					
				}else if ( selectNum == 4 ) {
					System.out.print("분석 입력>>> ");
					int max = 0;
					int sum = 0;
					double avg = 0;
					for(int i = 0; i < scores.length; i++ ) {
						if( max < scores[i]) {
							max = scores[i];
						}
					}
					for(int i = 0; i < scores.length; i++) {
						sum += scores[i];
						avg = (double)sum / (scores.length);
					}
					System.out.println("최고 점수: " + max );
					System.out.println("평균 점수: " + avg );
					
				
				}else if ( selectNum == 5 ) {
					System.out.println("프로그램을 종료합니다. ");
					run = false;					// run=false를 넣어줘서 while문 끝내기
 				}
			
		
		
		}System.out.println("프로그램 종료. ");
		
		
		
		
		
		
		
		

	}

}
