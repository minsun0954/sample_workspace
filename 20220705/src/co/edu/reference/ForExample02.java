package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {
	public static int sumAry(int[] ary) {// 메소드 정의구문. 정수의 값을 받아서 2배의 값으로 반환한다
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum; // 메소드를 호출한 영역으로 sum의 값을 반환.
	}

	public static void main(String[] args) {
		// int result = sumAry(10); // 메소드 호출구문. 10을 받아서 *2 한 값을 result
		// result = sumAry(20);
		// System.out.println("결과 값: "+ result);

		int sum = 0;
		double avg = 0;
		int[] intAry = { 34, 23, 56, 22, 99, 28 };

		// 1. intAry배열의 합과 평균
		sum = sumAry(intAry);
		avg = (double) sum / intAry.length;
		System.out.println("intAry배열의 합: " + sum);
		System.out.printf("intAry배열의 평균: %.1f\n", avg);

		// 1. intAry배열의 합과 평균
		// sum=0;
	  //// for(int i = 0; i < 6; i++) {
		// 	sum += intAry[i];
		// 	avg = (double)sum / intAry.length; // (double)sum 해줘야 소수점 나옴
		// }
		// System.out.println("intAry배열의 합: " + sum);
		// System.out.printf("intAry배열의 평균: %.1f\n" , avg );

		// 2. intArry 배열의 합과 평균
		sum = 0;
		int[] intArry = new int[6];
		for (int i = 0; i < intArry.length; i++) {
			intArry[i] = (int) (Math.random() * 100) + 1;
			sum += intArry[i];
			avg = (double) sum / intArry.length;
		}
		System.out.println("intArry배열의 합: " + sum);
		System.out.printf("intArry배열의 평균: %.1f\n", avg);

		// 2. intArry 배열의 합과 평균
		// sum=0; 											// sum 초기화 시키기, avg는 for문 안에 있어서 ㄱㅊ
		// int[] intArry = new int[6];
		// for(int i =0; i < intArry.length; i++) {
		// 	intArry[i] = (int)(Math.random()*100)+1;
		// 	sum += intArry[i];
		// 	avg = (double)sum / intArry.length;
		// 	}
		// System.out.println("intArry배열의 합: " + sum);
		// System.out.printf("intArry배열의 평균: %.1f\n" , avg );

		// 3. scanArray 배열의 합과 평균
		int[] scanArray = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < scanArray.length; i++) {
			System.out.println("임의의 수를 입력>>>>");
			scanArray[i] = scanner.nextInt();
		}
		sum = sumAry(scanArray);
		avg = (double) sum / scanArray.length;
		System.out.println("scanArray배열의 합: " + sum);
		System.out.printf("scanArray배열의 평균: %.1f\n", avg);

		// 3. scanArray 배열의 합과 평균
		// sum=0;
		// int[]scanArray = new int[5];
		// Scanner scanner = new Scanner(System.in);
		// for( int i = 0; i < scanArray.length; i++) {
		// System.out.println("임의의 수를 입력>>>>");
		// scanArray[i] = scanner.nextInt();
		// sum += scanArray[i];
		// avg = (double)sum / scanArray.length;
		// }
		// System.out.println("scanArray배열의 합: " + sum);
		// System.out.printf("scanArray배열의 평균: %.1f\n" , avg );

	}

}
