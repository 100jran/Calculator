package baek.Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.printf("두 수를 입력하세요.\n\n");
		
		System.out.println("첫번째 입력 값을 입력하세요.");
		System.out.print("FIRST NUM> ");
		int numOne = scan.nextInt();
		System.out.println();
		
		System.out.println("두번째 입력 값을 입력하세요.");
		System.out.print("SECOND NUM> ");
		int numTwo = scan.nextInt();
		System.out.println();

		System.out.println("사칙연산 결과");
		System.out.printf("+ : %d + %d = %d\n", numOne, numTwo, numOne + numTwo);
		System.out.printf("- : %d - %d = %d\n", numOne, numTwo, numOne - numTwo);
		System.out.printf("× : %d × %d = %d\n", numOne, numTwo, numOne * numTwo);
		System.out.printf("÷ : %d ÷ %d = %d\n", numOne, numTwo, numOne / numTwo);

	}
}
