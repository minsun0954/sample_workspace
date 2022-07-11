package co.edu.api;
/*
 * 주민번호 7번인덱스 문자를 읽어 성별 구별
 */
public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "010624-1230123";			// 남자
		ssn = "0106241230123";					// 여자
		
		checkGender(ssn);
	}

	public static void checkGender(String ssn) {		// 주민번호에 - 있던말든 성별구별 가능하게
		
		char sex = ssn.charAt(7);				// charAt() 인덱스 문자 추출
		
		if(ssn.length() == 13) {				// if 길이가 13개면 charAt6
		sex = ssn.charAt(6);
			}
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		
		
		
		
	}
	
}
