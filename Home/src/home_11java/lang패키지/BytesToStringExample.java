package home_11java.lang패키지;
/*/
 *  바이트배열을 문자열로 변환
 */
public class BytesToStringExample {
	
	public static void main(String[] args) {
		byte[] bytes = { 73,32,108,111,118,101,32,121,111,117};
		String str = new String(bytes);
		System.out.println(str);
		
		
		
	}

}
