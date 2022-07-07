package co.edu;
/*
 * 싱글톤 : 인스턴스를 여러개 생성없이 하나만 존재하도록 하는 것
 */
public class Singleton {
//필드
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}
