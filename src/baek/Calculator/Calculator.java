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

		System.out.println("연산기호를 입력하세요.(+, -, *, /)");
		System.out.print("CAL> ");
		String cal = scan.next();
		System.out.println();

		if (cal.equals("+")) {
			System.out.printf("+ : %d + %d = %d\n", numOne, numTwo, numOne + numTwo);
		}
		else if (cal.equals("-")) {
			System.out.printf("- : %d - %d = %d\n", numOne, numTwo, numOne - numTwo);
		}
		else if (cal.equals("×")) {
			System.out.printf("× : %d × %d = %d\n", numOne, numTwo, numOne * numTwo);
		}
		else if (cal.equals("÷")) {
			System.out.printf("÷ : %d ÷ %d = %d\n", numOne, numTwo, numOne / numTwo);
		} else {
			System.err.println("사칙연산 기호가 아닙니다!");
		}
	}
}
