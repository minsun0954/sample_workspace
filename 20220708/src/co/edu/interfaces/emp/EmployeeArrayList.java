package co.edu.interfaces.emp;

import java.util.ArrayList;

/*
 * 컬렉션 기반으로 기능 구현
 */
public class EmployeeArrayList implements EmployeeList {
	
	ArrayList<Employee> list;
	int empNum; // 필요없음
	
	@Override
	public void init() {
		
	}

	@Override
	public void input() {
		
	}

	@Override
	public Employee search(int empId) {
		return null;
	}

	@Override
	public void printlist() {
		
	}

}
