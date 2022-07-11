package co.edu.compound;

import java.util.Date;
/*
 * 게시글 한건의 정보
 */
public class Board {
	//필드
	private String title;
	private String content;
	private String writer;
	private Date creatDate;
	private int hitCount;
	
	
	// get set// 필드 괄호 안에서 생성
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public int getHitCount() {
		return hitCount;
	}
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	
	
	




}
	
	
