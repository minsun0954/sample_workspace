package home_11java.lang패키지;
/*
 * equals()와 hashCode()를 재정의 해서 Student의 학번(StudentNum) 같으면 동등 객체가 될수 있게
 *
 */
public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {

		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	
		return super.equals(obj);
	}
	
	
	
	
}
