package co.edu.compound;

public class FriendMain {
	public static void main(String[] args) {
		
		//f1
	
		Friend f1 = new Friend();
//		f1.name ="김민수";		
//		f1.tel ="010-0000-0000";		
//		f1.email = "naver.com";
//		f1.date = 0101;
//		f1.height = 170.1;		
//		f1.weight = 65.4;		
//		
//		f1.showName(f1.name);
//		f1.showTel();
//		f1.showInfo();
		
		f1.setName("김민수");
		f1.setTel("010-0000-0000");
		
		f1.setHeight(-170.1);
		System.out.println("키는: " + f1.getHeight() + "입니다.");
		
		f1.setWeight(66);
		System.out.println("몸무게는: " + f1.getWeight() + "입니다.");
		
		
		
		
		
		
		
		
	}
}
