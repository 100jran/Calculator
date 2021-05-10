package baek.Calculator;

import java.util.Scanner;

public class StringCommand {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("계산식을 입력하세요.");
		String input = scanner.nextLine();

		String[] inputS = input.split(" ");

		int numOne = Integer.parseInt(inputS[0]);
		int result = numOne;

		for (int i = 1; i < inputS.length; i += 2) {

			String symbol = inputS[i];

			int numTwo = Integer.parseInt(inputS[i + 1]);

			result = Calculate.getCalculater(result, symbol, numTwo);
		}
		
		Output.print(result);
		scanner.close();
	}
	
}
