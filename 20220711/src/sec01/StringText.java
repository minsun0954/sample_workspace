package sec01;
/*
 * .replace("바꿀문자열" ,"바뀐문자열")
 * .trim() 앞뒤 공백 없애기
 */
import co.edu.api.ClassEx;

public class StringText {
	public static void main(String[] args) {
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트","자 바"};		// 자바 문자열 포함
		
		String str1 = str[0];
		String str2 = str[1]; 
		String str3 = str[2];
		String str4 = str[3];
		String str5 = str[4];
					
		if(str1.indexOf("자바") != -1) {
			System.out.println(str1 + "은 자바가 포함되어있습니다. ");
		}else {
			System.out.println(str1 + "은 자바가 포함되어있지않습니다. ");
		}
			
		if(str2.indexOf("자바") != -1) {
			System.out.println(str2 + "은 자바가 포함되어있습니다. ");
		}else {
			System.out.println(str2 + "은 자바가 포함되어있지않습니다. ");
		}
		
		if(str3.indexOf("자바") != -1) {
			System.out.println(str3 + "은 자바가 포함되어있습니다. ");
		}else {
			System.out.println(str3 + "은 자바가 포함되어있지않습니다. ");
		}
		
		if(str4.indexOf("자바") != -1) {
			System.out.println(str4 + "은 자바가 포함되어있습니다. ");
		}else {
			System.out.println(str4 + "은 자바가 포함되어있지않습니다. ");
		}
		
		if(str5.indexOf("자바") != -1) {
			System.out.println(str5 + "은 자바가 포함되어있습니다. ");
		}else {
			System.out.println(str5 + "은 자바가 포함되어있지않습니다. ");
		}
		
		
//		String path = "c:/images/hello.png";							// 파일의 확장자 파일명
			Class cls = ClassEx.class;
//			String path = cls.getResource("images/hello.png").getPath();		
//			System.out.println("경로는: " + path );
		
		
		
 		String tel = "";												// tel에 031-2103-3478 넣기		
		String[] tels = { " 031", "210 3", "34 78 "}; 
		
		tel = tels[0].trim() + "-" + tels[1].trim().replace(" ", "") + "-" + tels[2].trim().replace(" ", "");
				System.out.println(tel);
			
		
		String[] ssn = { "970403-1234123", "010503 3456123", "980123/2412345", "0202023217891" };			// 배열 숫자 남자 여자 구분하기
		for(int i =0; i<ssn.length; i++) {
			checkGender(ssn[i]);
		}
	
	
	}
	public static void checkGender(String ssn) {
		String[] str = ssn.split("");
		String replaceSsn = "";
		for(int i = 0; i < str.length; i++) {
			replaceSsn += str[i].replace("-","").replace("/","").replace(" ","");
		}
		char sex = replaceSsn.charAt(6);				// charAt() 인덱스 문자 추출
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