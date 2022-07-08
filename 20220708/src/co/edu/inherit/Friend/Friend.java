package co.edu.inherit.Friend;
/*
 * 이름 연락처
 */
public class Friend {
	//필드
	private String name;
	private String phone;
	
	
	// 생성자 소스-
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	//set get
	public String getName() {
		return name;
	}


	public String getPhone() {
		return phone;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", toString()=" + super.toString() + "]";
	}
	
	
	public void showInfo() {
		System.out.print("이름:" + name + " 연락처: " + phone );
		
		// 친구이름 연락처
	}
	
	
	
	
	
}
