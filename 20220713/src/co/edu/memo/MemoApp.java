package co.edu.memo;

import java.util.Scanner;

/*
 * 등록 조회 삭제
 */
public class MemoApp {
	public static void main(String[] args) {
		//memomanager 기능 구현
	
	MemoManager memoApp = MemoManager.getInstance();				// new Memomanger(); 보통 이렇게 하느데 Private모드로 만들어서 안됨	
																	// 싱긅톤 Memomanger instance를 가지고 오겠다~~
	Scanner scn = new Scanner(System.in);
	
	int selectNo;
	boolean run = true;
	
	while(run) {
		System.out.println("1.등록 2.검색 3.삭제 4.종료 ");
		System.out.print("메뉴선택> ");
		selectNo = Integer.parseInt(scn.nextLine());
		
		switch(selectNo) {
		case 1:
			memoApp.inputData(); 
			break;
		case 2:
			memoApp.search();
			break;
		case 3:
			memoApp.deleteData();
			break;
		case 4:
			memoApp.storeToFile();
			run = false;
		}
	}System.out.println("프로그램 종료. ");
		
		
	
	
	
		
		
		
	}
}
