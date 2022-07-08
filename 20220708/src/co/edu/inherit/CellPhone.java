package co.edu.inherit;
/*
 * 상속 부모 <-자식
 * CellPhone <- DmbPhone 추가적인 정보
 * 부모
 */
public class CellPhone extends Object {
	//필드
	private String model;
	private String color;
	
	//생성자 constructor
	public CellPhone() {}			// default constructor 기본생성자
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("bell");
	}
	public void sendVoice() {
		System.out.println("메세지 전송");
	}
	public void receiveVoice() {
		System.out.println("메세지 수신");
	}
	
	
	// get set
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	// 재정의
	@Override
	public String toString() {
		return "model명은 " + model + " 색상은 " + color + "입니다. ";
	}
	
	
	
	
	
	
	

}
