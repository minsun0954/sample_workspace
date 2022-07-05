package co.edu.reference;

public class NestLoopExample01 {
	public static void main(String[] args) {

		for (int j = 1; j <= 3; j++) {
			// System.out.println("j의 값: " + j);
			for (int i = 1; i <= 5; i++) {
				// System.out.println(" i의 값: " + i);

			}
		}

		// 구구단
		for (int i = 1; i <= 9; i++) {
			// System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				// System.out.printf("%d * %d = %d\n", i , j , (i*j) );
			}
		}

		//
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print("*");
			}
			// System.out.println();
		}

		//

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i ; j--) {
				System.out.print(" ");
			}
			for (int a = 1; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
		
		
		
	}
}
