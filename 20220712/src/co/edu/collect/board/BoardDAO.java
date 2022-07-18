package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;

/*
 * 목록 등록 조회(작성자) 삭제
 */
public class BoardDAO {
	// 싱글톤.
	private static BoardDAO instance = new BoardDAO();			// 생성자를 호출하는 시점에 인스턴스 만들어주고
	List<Board> list ;											// 필드 list 
	private BoardDAO() {list = new ArrayList<>();}				// 
	
	public static BoardDAO getInstance() {						// 
		return instance;
	}
	
	
	// 1.목록
	public List<Board> boardList(){								// 리턴 값 = 컬렉션
		return list;
	}
	
	// 2.등록
	public void add(Board board) {
		list.add(board);
	}
	
	// 3.조회 - 작성자 - 글 목록
	public List<Board> search(String writer){
		List<Board> list = new ArrayList<>();					// 변수 list
		
		for(Board board : this.list) {							// 필드 list for-list에 있는 값들 읽는거
			if(board.getWriter().equals(writer)) {				// if - 보드 값 중에서 똑같은 이름이 있는가 체크
				list.add(board);								// 있으면 list board에 저장		
			}
		}
		
		return list; 
	}
	
	// 4.삭제 - 제목
	public void remove(String title) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				break;
			}
		}
	}















}
