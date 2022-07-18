package co.edu.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 등록 조회 삭제
 */
public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>();					// 초기화 상태
	Scanner scn = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat");					// 파일클래스 선언해서 
	
	
	// 싱글톤-인스턴스 만드는 방법
	private static MemoManager instance = new MemoManager();		// 기본 생성자
	private MemoManager() {
		// 파일 정보 => Arraylist
		readFromFile();
	}
	
	
	public static MemoManager getInstance(){
		return instance;
	}
	
	// 메모등록
	public void inputData() {
		System.out.print("메모번호> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("작성날짜입력> ");
		String date = scn.nextLine();
		System.out.print("내용입력> ");
		String content = scn.nextLine();
		
		memoStorage.add(new Memo(no,date,content));				// public Memo 생성자 가져와서 memoStoragre컬렉션에 넣어주기
		
	}
	
	// 날짜입력하고 모든 메모 출력
	public void search() {
		System.out.print("날짜입력> ");
		String memoDate = scn.nextLine();
		
		boolean isExist = false; 												// false -> 메모가 없으면 해당날짜의 메모리가 없습니다 메모가 있으면 true 
		for(int i = 0; i < memoStorage.size(); i++) {
			if(memoDate.equals(memoStorage.get(i).getDate()));	{				// 컬렉션중에 날짜 가져와서 같은 값인지 보기 맞으면 출력
				System.out.println(memoStorage.get(i).toString());
				isExist = true;
			}
		}
		if(isExist == false)
			System.out.println("해당날짜의 메모리가 없습니다. ");
	}
	
	
	// 번호 입력시 삭제
	public void deleteData() {
		System.out.println("삭제번호 입력> ");
		int delNo = Integer.parseInt(scn.nextLine());		
		
		Iterator<Memo> iter = memoStorage.iterator();	// 반복자 컬렉션에 저장되어있는 요소들을 읽어오는 방법을 표준화 
		
		while(iter.hasNext()) {							// iter.hasNext 읽어올 요소가 남아있는거 있나 확인하느거
			Memo memo = iter.next();
			if(memo.getNo() == delNo);{
				iter.remove();
				System.out.println("삭제완료. ");
				return;
			}
			
		}
		System.out.println("일치하는 번호가 없습니다.");
		
		
	}
	
	//종료
	public void storeToFile() {							// 종료하고 다시 검색하면 나옴! 저장되어있어서
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 객체를 처리해주는 보조스트림 ObjectOutputStream : ArrayList => 바이트배열 변경.
			ObjectOutputStream oos = new ObjectOutputStream(fos);	
			
			oos.writeObject(memoStorage);
			oos.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//파일읽어와서 컬렉션 타입으로 바꾸기
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			memoStorage = (List<Memo>) ois.readObject();
			ois.close();
			
		} catch (IOException |ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
