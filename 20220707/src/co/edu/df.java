package co.edu;
/*
 * 숫자 입력한 후 큰 수 작은 수 출력
 */
import java.util.Scanner;
	
public class df {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	System.out.println("a첫번째 수");
	int a= Integer.parseInt(scanner.nextLine());
	System.out.println("b두번째 수");
	int b= Integer.parseInt(scanner.nextLine());
	System.out.println("c세번째 수");
	int c= Integer.parseInt(scanner.nextLine());
	
	if(a>b && a>c) {
		System.out.println("a가 가장 큰수");
	}
	if(a<b && a<c) {
		System.out.println("a가 가장 작은수");
	}
	if(b>a && b>c) {
		System.out.println("b가 가장 큰수");
	}
	if(b<a && b<c) {
		System.out.println("b가 가장 작은수");
	}
	if(c>a && c>b) {
		System.out.println("c가 가장 큰수");
	}
	if(c<a && c<b) {
		System.out.println("c가 가장 작은수");
	}
	
		}			
}
