package co.edu;
/*
 * 랜덤배열 중 큰수 작은수 
 */
import java.util.Scanner;

public class ffff {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("=== 배열 원소 출력 ========");

		int t[] = new int[7];
		int max = 0;
		int maxindex = 0;
		int min = t[0];
		int minindex = 0;

		for (int i = 0 ;i<t.length;i++) {
			int num = (int) (Math.random() * 88 + 11);
			t[i] = num;
			System.out.print(t[i] + "\t");
		}

		max = t[0];
		maxindex = 0;
		for (int i = 1 ;i<t.length;i++) {
			if (max < t[i]) {
				max = t[i];
				maxindex = i;
			}
		}

		min = t[0];
		minindex = 0;
		for (int i = 1 ;i<t.length;i++) {
			if (min > t[i]) {
				min = t[i];
				minindex = i;
			}
		}

		System.out.print("\n가장 큰 값 : " + max);
		System.out.println("\t index = " + maxindex);
		System.out.print("가장 작은 값 : " + min);
		System.out.println("\t index = " + minindex);
		
		
		
		
		

	}
}