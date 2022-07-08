package co.edu.inherit;
/*
 * 상속 : 자식이 부모를 선택 extends
 * 자식 
 */
public class DmbCellPhone extends CellPhone {
	//필드
	private int channel;
	
	//생성자
	public DmbCellPhone() {  		// 부모클래스에 기본 생성자가 있어야 자식클래스에 생성자 호출 가능
		super();					// super : 부모 생성자를 호출 , 자식 생성자 첫 줄에 있어야함
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); 		// this.model = model 부모클래스에 있는거 가져옴
		this.channel = channel;
	}
		
	public void turnOn() {
		System.out.println("dmb화면 on");
	}
	public void turnOff() {
		System.out.println("dmb화면 off");
	}
	
	
	// overriding 재정의  부모가 가진 정의를 자식이 재정의 합니다
	@Override						// 부모의 메소드와 동일한 리턴타입, 메소드 이름, 매개 변수 목록
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	@Override
	public String toString() {
		return "model명은 " + getModel() + " 색상은 " + getColor() + " 채널은 " + channel + "입니다. ";
	}
	
	
}
