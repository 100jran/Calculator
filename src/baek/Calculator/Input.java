package baek.Calculator;

import java.util.Scanner;

public class Input {

	static int getFirstValue(Scanner scan) {

		System.out.println("값을 입력하세요.");
		System.out.print("NUM> ");
		int numOne = scan.nextInt();
		System.out.println();

		return numOne;
	}

	static String getSymbol(Scanner scan) {

		System.out.println("연산기호를 입력하세요.(+, -, *, /, q=종료)");
		System.out.print("SYMBOL> ");
		String symbol = scan.next();
		System.out.println();

		return symbol;
	}

	static int getSecondValue(Scanner scan) {

		System.out.println("값을 입력하세요.");
		System.out.print("NUM> ");
		int numTwo = scan.nextInt();
		System.out.println();

		return numTwo;
	}
}
