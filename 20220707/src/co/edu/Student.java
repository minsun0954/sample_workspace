package co.edu;
/*
 * 클래스 연습 StudenMain 사용
 */
public class Student {
	// 필드
	private String sno;
	private String name;
	private int score;
	
	// 생성자 : 기본생성자
	public Student() {}
	
	// 생성자 오버로딩 ( 똑같은 이름으로 여러개 만들기 )
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	
	
	
	
	//getter setter
	public void setSno(String sno) {		// 학번에 값을 대입
		this.sno = sno;
	}
	public void setName(String name) {
		this.name = name;					// name필드에다가 변수name 담아주겠다
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getSno() { 				// 한번을 반환
		return sno;		
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void showInfo() {
		System.out.printf("학번: %s, 이름: %s, 점수: %d\n", sno , name, score);
	}
	
}
