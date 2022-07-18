package co.edu.collect;

import java.util.HashSet;
import java.util.Set;

/*
 * 중복요소 제거
 * Set 컬렉션에 중복여부체크 => hashCode,equals => true;
 */

class Member{
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return " Member [ id= " + id + " , name= " + name + "]";
	}
	

	@Override
	public int hashCode() {					// 인스턴스마다 고유한 값
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		// 아이디, 이름 둘 다 같으면 => 논리적으로 동등한 객체
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			return this.id == mem.id && this.name.equals(mem.name);
		}
		return false;
	}
	
	
			
}

public class SetMemberExample {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		members.add(new Member(10,"홍길동"));
		members.add(new Member(20,"김민수"));
		members.add(new Member(30,"홍길동"));
		members.add(new Member(10,"홍길동"));		// 중복 제거를 위해 hashCode equals 메소드 재정의
	
		members.clear();    // 요소제거
		if(members.isEmpty()) {
			System.out.println("컬렉션이 비어 있음.");
		}
		
		
		for(Member member : members) {
			System.out.println(member.toString());
		}
	
	
	}

}
