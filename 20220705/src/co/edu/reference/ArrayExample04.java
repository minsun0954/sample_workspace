package co.edu.reference;

public class ArrayExample04 {
	public static void main(String[] args) {
		// A반 80, 85, 83
		// B반 79, 34, 90
		
		int[][] banAry = new int[2][3];
			banAry[0][0] = 80;
			banAry[0][1] = 85;
			banAry[0][2] = 83;
			banAry[1][0] = 79;
			banAry[1][1] = 84;
			banAry[1][2] = 90;	
		//int[][] banAry = {{80,85,83}, {79,84,90}};	
		
			int sum1=0; int sum2=0;
			for (int i = 0 ; i < banAry[0].length; i++) { 	// i가 banAry[0]보다 작다!!!
				sum1 += banAry[0][i];
				sum2 += banAry[1][i];
			}
			double avg1 = (double)sum1 / banAry[0].length;
			double avg2 = (double)sum2 / banAry[1].length;
			System.out.printf("A반 평균은 %.1f 입니다. \n", avg1);
			System.out.printf("B반 평균은 %.1f 입니다. \n", avg2);
			
			System.out.println(banAry.length);
			
			
	

		
		
		
		
		
		
		
		
		
	}

}
