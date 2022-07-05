import java.util.Scanner;

public class home_5배열 {

	public static void main(String[] args) {
		//최대값
				int max1 = 0;
				int[]array = {1,5,3,8,2};
				
				for(int i =0; i < array.length; i++ ) {
					if(array[i] > max1) {
						max1 = array[i];
					}
				}System.out.println("max1는 "+ max1);
				
				// 중첩 for 배열의 젼체 항목의 합과 평균
				int[][] array1 = {
						{95,86},
						{83,92,96},
						{78,83,93,87,88}
						};
				
				int sum1 = 0;
				double avg1 = 0.0;
				int count =0;
				for(int i = 0; i < array1.length; i++) {
					for(int j = 0; j < array1[i].length; j++) {
						sum1 = sum1 + array1[i][j];
						count++; 
					}
				}
				avg1 = (double)sum1/count;
				System.out.println(sum1);
				System.out.println(avg1);
				
				// 학생 수 와 각 학생들의 점수 입력받아서 최고 점수 및 평균 점수 
				Scanner scanner = new Scanner(System.in);
				
				boolean run = true;
				int studentNum = 0;		//	학생 수
				int[] scores = null;	// 학생 점수
				
				while(run) {
					System.out.println("------------------------------------");
					System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
					System.out.println("------------------------------------");
					System.out.print("선택>>");
					
					int selctNo = Integer.parseInt(scanner.nextLine());
					
					if( selctNo == 1) {
						System.out.print("학생수> ");
						studentNum = Integer.parseInt(scanner.nextLine());
						scores  = new int[studentNum];
					}else if (selctNo == 2) {
						for (int i = 0; i < scores.length; i++) {
							System.out.print( "scores[" + i + "]>");
							scores[i] = Integer.parseInt(scanner.nextLine());
						}
					}else if (selctNo == 3) {
						for (int i = 0; i < scores.length; i++) {
							System.out.println("scores[" + i + "]:" + scores[i]);
						}
					}else if (selctNo == 4) {
						int max = 0;
						int sum = 0;
						double avg =0;
						for(int i = 0; i < scores.length; i++){
							max = (max < scores[i]) ? scores[i] : max;
							sum += scores[i];
							}
						avg = (double)sum / studentNum;
						System.out.println("최고점수: " + max);
						System.out.println("평균점수: " + avg);
					}else if (selctNo == 5){
					run = false;			
					}
				}
				System.out.println("프로그램 종료");		

	}

}
