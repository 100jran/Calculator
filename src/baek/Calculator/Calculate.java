package baek.Calculator;

public class Calculate {

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
}
