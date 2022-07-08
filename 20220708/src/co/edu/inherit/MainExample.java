package co.edu.inherit;

public class MainExample {
	public static void main(String[] args) {

		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("AnyCall");
		phone.setColor("White");
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();

		phone.turnOn();
		phone.turnOff();
		
		
		phone.powerOff();
		
		//SmartPhone
		SmartPhone sphone = new SmartPhone();
		sphone.setColor("Galaxy");
		sphone.setColor("Black");
		
		sphone.powerOn();
		sphone.powerOff();
		
		System.out.println("자동형변환 >>>>> "); 	// 부모 > 자식  long <- int 자동형변환 int <- long 강제형변환
		
		//방법1
		CellPhone dphone = new DmbCellPhone("iphone", "Red",100);
		System.out.println(dphone.toString());
		
		//방법2
		CellPhone cphone = new CellPhone();
		cphone.setModel("LG Phone");
		cphone.setColor("Gray");
		System.out.println(cphone.toString());
		
		
		// 자식 인스턴스는 부모로 할당은 가능하나 기능은 불가
		if(dphone instanceof DmbCellPhone) {					// dmbcellphone의 인스턴스가 맞으면 실행하시
			DmbCellPhone dcp = (DmbCellPhone) dphone;			//자동형변환 해쥼 컴파일오류는 없음
			dcp.powerOn();
			dcp.turnOn();			// 자식이 가진 기능은 불가
			dcp.powerOff();
		}
		
		
		
		
		
	}
}
