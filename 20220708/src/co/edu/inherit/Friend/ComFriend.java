package co.edu.inherit.Friend;

public class ComFriend extends Friend {
	//필드
	private String company;
	private String department;
	
	//생성자
	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	
	@Override
	public String toString() {
		return "[이름: " + getName() + ", 연락처: " + getPhone() + ", 회사: " + company + ", 부서: " + department + "]";
	}
	
	@Override
	public void showInfo() {		// 친구이름 연락처 회사 부서
		super.showInfo();
		System.out.println( " 회사: " + company + " 부서: " + department);
	}
	
	

	
}
