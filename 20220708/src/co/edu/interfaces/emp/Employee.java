package co.edu.interfaces.emp;

public class Employee {
	//필드
	private int  employeeId; 		//사번
	private String name;			//이름
	private int departmentId;		//부서번호 10인사 20개발 30영업(기본값)
	private String departmentName;	//부서명
	private int salary; 			//급여
	private String email; 			//이메일
	
	//생성자
	public Employee() {}
	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		if(departmentId == 10) {
			departmentName = "인사";
		}else if(departmentId == 20) {
			departmentName = "개발";
		}else/*else if(departmentId == 30)*/ {
			departmentName = "영업";
		}		
	}
	
	//사번, 이름 초기화
	public Employee(int employeeId, String name) {
		this(employeeId, name, 100, 30);		//this 다른 생성자를 호출
	}
	
	//상세정보 반환 기능
	public String getDetaInfo () {
		//사원번호 이름 급여 부서 
		String info = "사원번호: " + departmentId + "사원이름: " + name + " 급여: " + salary;
		info +=  ", 부서정보: " + departmentName;
		return info;
	}
	
	
	
	
	//사번 이릅 급여
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);
	}
	
	
	// get
	public int getEmployeeId() {
		return employeeId;
	}
	
	// set
	public void setEmployeeId() {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		 return name;
	 }
	 
	public void setName() {
		 this.name = name;
	 }
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId() {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName() {
		this.departmentName = departmentName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary() {
		this.salary = salary;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail() {
		this.email = email;
	}
	
	
}
