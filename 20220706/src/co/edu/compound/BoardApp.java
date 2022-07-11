package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

/*
 *  등록 조회 수정 삭제 리스트 종료
 *  id:user1 passwd: 1212 => 로그인되었습니다
 *  					실패시 => 아이디와 비번을 확인하세요
 */
public class BoardApp {
	public static void main(String[] args) {
		
		Board[] boards = new Board[100];				// 공간이 100인 배열 null값
		Scanner scanner = new Scanner(System.in);		// 
		
		// 로그인 처리 기능.
		
		boolean run = true;
		
		String id = "user1";
		String passwd = "1212";
		
		
		while(run) { 
			System.out.println("아이디를 입력하세요. ");
			  String inputId = scanner.nextLine();
			
			System.out.println("비밀번호를 입력하세요. ");
				String inputPasswd = scanner.nextLine();
			
			if( id.equals(inputId) && passwd.equals(inputPasswd)) {
				
				System.out.println("로그인되었습니다 ");
				break;
			}else  {
				System.out.println("아이디와 비번을 확인하세요. ");
			}
				
		}
	
		

		
		
		while(run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.리스트 6.종료");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				//게시글 등록 (제목,내용,작성자,작성일시,조회수(0))
				System.out.println("글 제목을 입력하세요.");
				String title = scanner.nextLine();
				
				System.out.println("글내용을 입력하세요");
				String content = scanner.nextLine();
				
				System.out.println("글 작성자를 입력하세요.");
				String writer = scanner.nextLine();
				
				
				Board board = new Board();				 
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreatDate(new Date());
				board.setHitCount(0);
				
				// 배열의 비어있는 위치에 저장.
				for(int i =0; i<boards.length; i++) {			// 100번 반복
					if(boards[i] == null) { 					// 만약 배열boards[i]가 null이면 값을 저장하고 나옴
						boards[i] = board;
						break;
					}
				}
				System.out.println("정상적으로 입력했습니다.");
				
			}else if(selectNo == 2) {
				// 게시글 조회: 제목조회.
				System.out.println("조회할 제목을 입력하세요.> ");
				String findTitle = scanner.nextLine();
				for(int i = 0; i<boards.length; i++) {				// boards[i] != null && => 빈배열이 아니고 제목이 똑같으면  
					if(boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d\n",
						boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(), boards[i].getCreatDate(), boards[i].getHitCount());
					
						// 카운트 증가
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
					
					}
					
				}
				
			}else if(selectNo == 3) {
				// 수정 제목을 찾아서 내용 바꿔줌
				System.out.println("수정할 글 제목을 입력하세요.> ");
				String findTitle = scanner.nextLine();
				for(int i = 0; i<boards.length; i++) {		
					if(boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("수정할 내용을 입력하세요.> ");
						String changeContent = scanner.nextLine();
						boards[i].setContent(changeContent);
						System.out.println("정상적으로 처리되었습니다. ");
					}
				
				}
			}else if(selectNo == 4) {
				// 게시글 삭제: 똑같은 제목있으면 삭제 => null
				System.out.println("삭제할 제목을 입력하세요.> ");
				String findTitle = scanner.nextLine();
				for(int i = 0; i<boards.length; i++) {
					if(boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						boards[i] = null;
						System.out.println("삭제 완료 되었습니다. ");
					}
				}
				
				
				
				
			}else if(selectNo == 5) {
				//전체리스트
				for (int i = 0; i< boards.length; i++) {			//
					if(boards[i] != null) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d\n",
						boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(),boards[i].getCreatDate(),boards[i].getHitCount());
					}
				}
				
			}else if(selectNo == 6) {
				System.out.println("프로그램을 종료합니다...");
				run=false;
			}
			
			
			
		}
		System.out.println("프로그램 종료. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		
	
		
}	
		
		

