package co.edu.api;

class Member extends Object {				// 11장 471
	String id;
	int age;
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
		boolean b1 = this.id.equals(((Member)obj).id);			//// equals 재정의(오버라이딩) = 
		boolean b2 = this.age == (((Member)obj).age);
			return b1 && b2;					
	}
	return false;	
}
	
	@Override
	public String toString() {
		return "아이디: " + id + " 나이: " + age;
	}
}


public class ObjectEx {
	public static void main(String[] args) {
		
		Object objt1 = new Object();			// instance 주소값
		Object objt2 = new Object();			// instance 주소값
	
					
		System.out.println(objt1.equals(objt2));				// false => 객체의 주소값 비교
		System.out.println(objt1.toString()); 					// Object.toString() 객체 주소값 출력 478P
		
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println(name1.equals(name2));				// true => 객체의 주소값을 비교하는게 아니라 str값을 비교함
		System.out.println(name1.toString());					// 홍길동 오버라이딩 되어서 문자열 나옴
			
		
		
		Member member1 = new Member();
		member1.id = "user1";
		member1.age= 10;
		
		Member member2 = new Member();
		member2.id = "user1";
		member2.age= 10;
		
		System.out.println(member1.equals(member2));			// false => 객체의 주소값 비교, class member에서 오버라이딩 해줌 => true
																// 물리적 다른 객체 논리적 동일한 객체
		
		System.out.println(member1.toString());					// 객체주소값
		
		
		
		
	}

}
