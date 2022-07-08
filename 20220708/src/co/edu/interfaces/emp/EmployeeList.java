package co.edu.interfaces.emp;
/*
 * 기능 정의부분
 * 인터페이스 구현 객체			=> EmployeeList 인터페이스(초기화 입력 조회 전체출력)
 */
public interface EmployeeList {
	// 배열 초기화
	public void init();
	
	// 사원의 정보 입력
	public void input();
	
	// 사번에 해당하는 정보를 조회
	public Employee search(int empId);
	
	// 전체 출력
	public void printlist();
	
	
	
}
