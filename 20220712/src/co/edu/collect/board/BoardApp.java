package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  main메소드를 담고 있는 클래스	
<1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료>

 */
public class BoardApp {
	public static void main(String[] args) {
		
		BoardDAO app = BoardDAO.getInstance();
		
	// 메뉴 선택 => 선택값 => 구현
		while(true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			System.out.print("선택> ");
			
			Scanner scn = new Scanner(System.in);
			int selectNum = scn.nextInt();scn.nextLine();		// nextInt() nextLine()		
																// Integer.parseInt(scn.nextInt) 강제형변환 해줘도 됨 
			if(selectNum == 1) {
				List<Board>list = app.boardList();
				for(Board b:list) {
					System.out.println(b.toString());
				}
				
				
			}else if(selectNum == 2){
				 
				
				System.out.println("작성자이름을 입력하세요. ");
					String writer = scn.nextLine();
				
				System.out.println("제목을 입력하세요. ");
					String title = scn.nextLine();
					
				System.out.println("내용을 입력하세요. ");
					String content= scn.nextLine();
				
					app.add(new Board(writer,title,content));
				
					
			}else if(selectNum == 3){
				System.out.println("조회할 작성자를 입력하세요. ");
				String writer= scn.nextLine();
				
				List<Board>list = app.search(writer);				// 리턴타입이 List<Board>
				for(Board b:list) {									// 목록 돌면서 toString출력 => Board에 오버로딩
					System.out.println(b.toString());
				}
				
			}else if(selectNum == 4){
				System.out.println("삭제할 제목을 입력하세요. ");
				String title = scn.nextLine();
				
				app.remove(title);									// 리턴타입이 없음 void
				
				
			}else if(selectNum == 5) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			
			}else {
				System.out.println("다시 선택해주세요.");
			}
		
		
		
			
		}
		System.out.println("프로그램 종료.");
	
	
	
	}
}
