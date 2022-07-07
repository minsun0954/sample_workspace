package co.edu.emp;

import java.util.Scanner;
/*
 * 저장, 등록, 조회, 리스트
 */
public class EmployeeList {
	//싱글톤
	private static EmployeeList instance = new EmployeeList();
	private EmployeeList() {
	}
	public static EmployeeList getInstance() {
		return instance;
	}
	
	// 배열
	Employee[] list; 	// 사원 배열
	int empNum; 		// 몇번째 사원인가(?)
	Scanner scn = new Scanner(System.in);
	
	
	// 리스트 초기화 : 지금은 사용안함
//	private EmployeeList(Employee[] list) {
//		this.list = list;
//		this.empNum = list.length;
//	}
	
	// 배열객체 선언
	public void init() {
		System.out.println("사원수 입력> ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}
	
	// 사원정보 입력 => 배열에 추가
	public void input() {
		if (empNum >= list.length) {
			System.out.println("입력 초과");
			return;
		}
		
		System.out.printf("%d 사번> ", empNum);
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.printf("이름> ");
		String name = scn.nextLine();
		
		System.out.printf("급여> ");
		int sal = Integer.parseInt(scn.nextLine());
		
		list[empNum++] = new Employee(no, name, sal); 		// 사원 인스턴스 => 배열저장 list[0] list[1] list[2] ... 저장 
		}
	
	
	// 전체 출력
	public void printList() {
		for(int i =0; i < empNum; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeeId() , list[i].getName(), list[i].getSalary());
		}
	}
	
	// 4. 상세조회. 사원에 상세정보를 보여주는 기능 Employee추가.
	public void search () {
		System.out.println("사원번호를 입력> ");
		int employeeId = Integer.parseInt(scn.nextLine());
		
		for (int i = 0; i < empNum; i++) {
			if(employeeId == list[i].getEmployeeId()) {
				System.out.println(list[i].getDetaInfo());
				break;
			}
		}
	}

// 말일정보
	private int getLastDate(int mon) {
		switch(mon) {
		case 6:
			return 30;
		case 7:
			return 31;
		default:
			return 30;
		}
	}
	
// 1일의 요일정보
	private int getDayInfo(int mon) {
		switch(mon) {
		case 6:
			return 3;  		// 첫째날 요일정보
		case 7:
			return 5;
		default:
			return 0;
		}
	}
	
	
//달력	 5월 8월 완성해오기
	public void showCalendar() {
		 System.out.println("월 입력>>> ");
		 int month = Integer.parseInt(scn.nextLine());
				 
		 // 요일정보 1일의 위치 말일의 날짜 
		 String[] days = {"Sun" , "Mon" , "Tue" ,"Wed", "Thr" ,"Fri" ,"Sat"};
		 int firstDay = getDayInfo(month); // 일0 월1 화2 수3 목4 금5 토6 
		 int lastDate = getLastDate(month);
		 
		 for(int i = 0; i < days.length; i++) {
			 System.out.printf("%4s",days[i]);
		 }
		 System.out.println();
		 for(int i =0; i< firstDay; i++) {
			 System.out.printf("%4s", " "); // 1일이 목요일이니깐 앞에 빈공간 4개
		 }
		 for(int i =1; i <= lastDate; i++) {
			 System.out.printf("%4s", i);
			 if((i + firstDay) % 7 == 0) {		//  (i+firstDay) 7개 출력했으면 줄바꿈
				 System.out.println();
			 }
		 }
		 
	 }
}