package co.edu;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100 ~ 90:A ~80:B ~70:C 그외:D
		// 출력값 : 점수 78은 C 등급입니다!
		
		// if-else if-else
		System.out.println("임의의 값 입력 > ");	// !!!!! 스캐너 사용시 입력 값 넣어주는거 적기 !!!!!
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		String grade = "";
		
		if ( 90 <= score && score <= 100) {
			grade = "A";
		} else if ( 80 <= score) {
			grade = "B";
		} else if ( 70 <= score) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println("점수"+ score + "은 " + grade +"등급입니다! ");
		
		
		// 삼항 연산자
		grade = (score >= 90) ? "A" : (score >=80) ? "B" : (score >=70) ? "C" : "D";
		System.out.println("점수"+ score + "은 " + grade +"등급입니다! ");
			
		
		// if중첩문
		if ( 90 <= score && score <= 100) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if ( 80 <= score) {
			if (score >= 85) {
				grade = "B+";
			}else {
				grade = "B"; 
			}
		} else if ( 70 <= score) {
			if (score >= 75) {
				grade = "C+";
			}else {	
				grade = "C";
			}
		} else {
			grade = "D";
		}
		System.out.println("점수"+ score + "은 " + grade +"등급입니다! ");
		
		
		
		
		
		
		
		
	}

}
