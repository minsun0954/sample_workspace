package co.edu.memo;

import java.io.Serializable;

/*
 * 메모번호 날짜시간 메모내용
 */
public class Memo implements Serializable {				// Serializable 직렬화
		
	// 필드
	private int no;
	private String date;
	private String content;
	
	// 생성자
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
		
	}
	// 기본생성자
	public Memo() {}
	
	// get set
	public int getNo() {
		return no;
	}
	public String getDate() {
		return date;
	}
	public String getContent() {
		return content;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override													// source - toString()
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}
	

	
	
	
	
	
	
	
	
	
}
