package co.edu;

public class MorningWx2 {

	public static void main(String[] args) {
		// 정수(int) 배열 6개 intAry
		// 1~ 100까지의 임의의 값
		
		int[] intAry = new int[6];
		
		int max = intAry[0];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < intAry.length; i++) {
			intAry[i] = (int)(Math.random()*100)+1;
			
			sum += intAry[i];
			
		}
		avg = (double)sum / intAry.length;
		System.out.println(sum);
		System.out.println(avg);
		
		// 확장 for - 만든 배열 출력
		for(int num : intAry) {
			System.out.println(num);
		}
		
				
		
	}

}
