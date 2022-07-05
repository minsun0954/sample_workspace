import java.util.Scanner;

public class home_3연산자 {

	public static void main(String[] args) {
	

	int x = 10;
	int y = 20;
	int z = (++x) + (y--);
	System.out.println(z); // 11+20 = 31 x=11 y=19
	
	// 534자루의 연필을 30명의 학생에게 똑같은 개수로 나눠줄때 1인당 몇개 가능 몇개 남음?
	int pencil = 534;
	int student = 30;
	
	int num1 = pencil/student ;
	System.out.println(num1);		// 17개
	
	int num2 = pencil%student ;
	System.out.println(num2);		// 24개
		
	// 
	int var1 = 5;
	int var2 = 2;
	double var3 = var1/var2; 	//var3 = 2.0
	int var4 = (int)(var3*var2); // var4 = 4
	System.out.println(var4);	 
		
	// 십의 자리 이하는 버리는 코드 변수 value의 값이 356이라면 300나오게 
	int value = 356;
	System.out.println(value/100*100);
	
	// 사다리꼴의 넓이를 구하는 코드 정확한 소수점 자리 나오도록
	int lengthTop =5;
	int lengthBottom =10;
	int height =7;
	double area = ((lengthTop+lengthBottom)/0.5*height);
	System.out.println(area);
	
	// scanner이용
	// 입력된 첫 번째 수에 두 번째수를 나눈 결과를  "결과:값"출력
	// 두 번째 수에 0또는 0.0입력되었을 경우 "결과:무한대" 출력
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("첫번째 입력 수: "); 
	 double num3 = Double.parseDouble(scanner.nextLine());
	
	System.out.println("두번째 입력 수: ");
	double num4 = Double.parseDouble(scanner.nextLine());
	
	if(num4 != 0) {
		System.out.println("결과 : " + num3/num4);
	}else {
		System.out.println("결과 : 무한대");
	}
	 
	// 반지름이 10인 원의 넓이를 구하는데 var2, ".". var3을 + 연산해서 원주율 얻은 다음 계산
	int var5 = 10;
	int var6 = 3;
	int var7 = 14;
	double var8 = var5 * var5 * Double.parseDouble(var6+ "." +var7);
	System.out.println("원의 넓이:" + var8);
	
	// 키보드로 아이디와 패스워드 입력받는다
	// 입력 조건 이름은 문자열 패스워드는 정수 패스워드는 int타입으로 변환
	// 입력된 내용을 비교해서 아이디가 "jave" 패스워드 12345 라면
	// "로그인 성공" 아니면 "로그인 실패" 출력
	
	// Scanner scanner = new Scanner(System.in;)
	
	System.out.println("아이디: ");
	String name = scanner.nextLine();
	
	System.out.println("패스워드: ");
	String strPassword = scanner.nextLine();
	
	int password = Integer.parseInt(strPassword);
	
	if(name.equals("java")) {
		if(password == 1234) {
			System.out.println("로그인 성공");
		}
		}else {
			System.out.println("로그인 실패");
	}
	
	// 
	int a = 10;
	int b = 5;
	System.out.println((a>7)&&(b<=5));				// true
	System.out.println((a%3 == 2) || (b%2 !=1));	// false
	
	// 대입 연산자 = 와 산술 연산자 + - * / 로 구성된 실행문을 대입 연산자 하나로 구성된 실행문으로 변경
	int value1 = 0;
	
	value1 = value1 + 10;   // value += 10;
	value1 = value1 - 10; 	// value -= 10;
	value1 = value1 * 10;	// value *= 10;
	value1 = value1 / 10;	// value /= 10;
	
	// 다음 코드를 실행했을 때 출력 결과
	int score = 85;
	String result = (!(score>90)) ? "가" : "나" ;
	System.out.println(result);   		// 가

		
		
	}
}
