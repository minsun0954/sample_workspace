package co.edu.compound;
/*
 * 이름 연락처 email 생일 키 몸무게
 */
public class Friend {
	// 필드 생성 규칙: 소문자, cameCase, 영문, _ 
	// private 생성자의 접근 제한
	private String name;
	private String tel;
	private String email;
	private int date;
	private double height;
	private double weight;

	
	
	// 생성자: 기본생성자 생성
	public Friend(){
		System.out.println();
		
	}
	
	
	
	// 메소드
	public void name() {
		System.out.println("이름은 " + name + "입니다. ");
	}
	public void tel() {
		System.out.println("전화번호는 " + tel + "입니다. ");
	}
	public void email() {
		System.out.println("이메일은 " + email + "입니다. ");
	}
	public void date() {
		System.out.println("생일은 " + date + "입니다. ");
	}
	public void height() {
		System.out.println("키 " + height + "입니다. ");
	}
	public void weight() {
		System.out.println("몸무게는 " + weight + "입니다. ");
	}
	
	
	
	// 이름, 연락처 보여주는 showInfo()
	public void showName(String name) {
		this.name = name;
	}
	public void showtel() {
		System.out.println("현재 연락처는"+ tel +"입니다. ");
		
	}
	public void showInfo() {
		System.out.printf ("이름은" + name+ "전화번호는 " + tel);
		
	}
	
	
	
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setHeight(double height) {
		if(height < 0) {
			System.out.println("잘못된 값이 입력됐습니다. ");
			this.height = 165.0;
		}else {
			this.height = height;
		}
	}
	
	// get 보여줌
	public double getHeight() {
		return height;
	}
 		
	
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public int getDate() {
		return date;
	}

	
	
	
	
	
	public void setWeight(double weight) {
		if(weight < 0) {
			System.out.println("잘못된 값이 입력됐습니다. ");
			this.weight = 65.4;
		}else {
			
			this.weight = weight;  // 정상적인 값
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	
	
	

}
