package home_forEx;

public class home_for_02 {

	public static void main(String[] args) {
//	숫자는 오른쪽정렬로)
//	실행결과) 
//	1부터  1까지의 합 :  1              
//	1부터  2까지의 합 :  3              
//	1부터  3까지의 합 :  6              
//	1부터  4까지의 합 : 10              
//	1부터  5까지의 합 : 15              
//	1부터  6까지의 합 : 21              
//	1부터  7까지의 합 : 28            	  
//	1부터  8까지의 합 : 36              
//	1부터  9까지의 합 : 45              
//	1부터 10까지의 합 : 55
	
	int sum=0;
	for(int i = 1; i <= 10; i++){
		sum += i;
		System.out.println("1부터 " + i + "까지의 합 : " + sum);
	}
	
		

	}

}
