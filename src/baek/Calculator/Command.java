package baek.Calculator;

import java.util.Scanner;

public class Command {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numOne = Input.getFirstValue(scanner);
		int result = numOne;

		while (true) {

			String symbol = Input.getSymbol(scanner);

			if (symbol.equals("q")) {
				Output.print(result);
				break;
			}

			int numTwo = Input.getSecondValue(scanner);

			result = Calculate.getCalculater(result, symbol, numTwo);
		}

		System.out.println("종료");
	}
}
