package co.edu.inherit.Friend;

import java.util.Scanner;

/*
 * 등록 목록 조회
 */
public class FriendApp {
	//생성자 기본생성자사용
	
	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);

	public void start() {
		while (true) {
		System.out.println("1.등록 2.조회 3.목록 9.종료");
		System.out.println("선택> ");
		
		int selectNo=0;
		try {
			selectNo = Integer.parseInt(scn.nextLine());		//문자열"12" -> 숫자12 / 문자열 가 -> 에러
		}catch(Exception e) {
			System.out.println("숫자를 다시 입력하세요 ");					//예외처리 try 블럭 안에서 오류가나면 catch실행 후 다음 진행	
		}														//while문 안에 있어서 1.등록 2.조회 3.목록 9.종료 부터 시작
																			
		if(selectNo == 1) {
			add();
		}else if(selectNo == 2) {
			search();
		}else if(selectNo == 3) {
			list();
		}else if(selectNo == 9) {
			System.out.println("프로그램을 종료합니다. ");
			break;
		}
	
	
		} //while밖
		System.out.println("프로그램 종료");
}// end of start
	
		
	private void add() {
		int choice = 0;
		
		while(true){
		System.out.println("1.학교 2.회사 3.친구");
		System.out.print("선택> ");
		try { 
			choice = Integer.parseInt(scn.nextLine());
			break;
		}catch(Exception e) {
			System.out.println("1,2,3번 중에 선택하세요.");
			}
		}
		
		System.out.print("이름> ");
		String name = scn.nextLine();
		System.out.print("연락처> ");
		String phone = scn.nextLine();
		
		if (choice == 1) {
			System.out.print("학교이름> ");
			String univ = scn.nextLine();
			System.out.print("전공> ");
			String major = scn.nextLine();
		
			friends[friendNum++] = new UnivFriend( name, phone, univ, major );
			
		}else if(choice == 2) {
			System.out.print("회사이름> ");
			String company = scn.nextLine();
			System.out.print("부서> ");
			String department = scn.nextLine();
		
			friends[friendNum++] = new UnivFriend( name, phone, company, department );
			
		}else if(choice == 3) {
			
			friends[friendNum++] = new Friend(name,phone);
		}
		
		
	
	}
	private void search() {					// 친구이름 입력 => 친구상세정보 showInfo()
		System.out.println("찾을 이름 입력>> ");
		String fName = scn.nextLine();
		
		for(int i = 0; i < friendNum; i++) {
			if(friends[i].getName().equals(fName)) {
				friends[i].showInfo();			// System.out.println(friends[i].showInfo());  => 프린트한걸 프린트 하니깐 오류님		
			}else {
				System.out.println("찾을 수 없습니다.");				
			}					
		}
	}
	
	
	private void list() {
		for(int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}	
	}
	
	
	private void timerShow(String msg) {
		String[] message = msg.split("");
		for(int i =1; i < message.length; i++) {
			System.out.println(message[i]);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();			
	}
	
}	
