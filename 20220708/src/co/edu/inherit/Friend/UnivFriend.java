package co.edu.inherit.Friend;

public class UnivFriend extends Friend {
	//필드
	private String univ;
	private String major;
	
	//생성자
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	


	@Override
	public String toString() {
		return "[이름: " + getName() + ", 연락처: " + getPhone() + ", 대학교: " + univ + ", 전공: "	+ major + "]";
	}
		
	@Override
	public void showInfo() {			// 친구이름 연락처 대학교 전공
		super.showInfo();
		System.out.println( " 대학교: " + univ + " 전공: " + major);
	
	}





}
