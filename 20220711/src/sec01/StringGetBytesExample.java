package sec01;

import java.io.UnsupportedEncodingException;

/*
 * 문자열을 바이트 배열로 인코딩하고 길이출력
 * 그리고 다시 String 생성자를 이용해 문자열로 디코딩
 */
public class StringGetBytesExample {
	public static void main(String[] args) {
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();								// 문자열str을 바이트배열bytes1로 변환
		System.out.println("bytes1.length: " + bytes1.length );
		String str1 = new String(bytes1);							// 
		System.out.println("bytes1->String: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes2.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes2->String: " + str3);
		
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}

}
