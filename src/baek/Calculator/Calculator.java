package baek.Calculator;

import java.util.Scanner;

public class Calculator {

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

	static int getCalculater(int result, String symbol, int numTwo) {

		if (symbol.equals("+")) {
			System.out.printf("%d + %d = ", result, numTwo);
			result = result + numTwo;
			System.out.println(result);
			System.out.println();
		} else if (symbol.equals("-")) {
			System.out.printf("%d - %d = ", result, numTwo);
			result = result - numTwo;
			System.out.println(result);
			System.out.println();
		} else if (symbol.equals("*")) {
			System.out.printf("%d × %d = ", result, numTwo);
			result = result * numTwo;
			System.out.println(result);
			System.out.println();
		} else if (symbol.equals("/")) {
			System.out.printf("%d ÷ %d = ", result, numTwo);
			result = result / numTwo;
			System.out.println(result);
			System.out.println();
		} else {
			System.err.println("사칙연산 기호가 아닙니다!");
			System.out.println();
		}
		return result;
	}

	static void print(int result) {

		System.out.printf("최종 값 = %d\n", result);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numOne = getFirstValue(scanner);
		int result = numOne;

		while (true) {

			String symbol = getSymbol(scanner);
			
			if (symbol.equals("q")) {
				print(result);
				break;
			}
			
			int second = getSecondValue(scanner);

			result = getCalculater(result, symbol, second);
		}
		
		System.out.println("종료");
	}
}
