package co.edu.api;

public class ResourceExample {
	public static void main(String[] args) {
		
		Class cls = ClassEx.class;
		String path = cls.getResource("sample.txt").getPath();			// sample파일의 파일 경로	p483
		
		System.out.println("경로: " + path );
		
	}

}
