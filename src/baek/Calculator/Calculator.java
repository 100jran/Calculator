package baek.Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("값을 입력하세요.");
		System.out.print("NUM> ");
		int numOne = scan.nextInt();
		System.out.println();

		int result = numOne;

		while (true) {

			System.out.println("연산기호를 입력하세요.(+, -, *, /, q=종료)");
			System.out.print("SYMBOL> ");
			String symbol = scan.next();
			System.out.println();
			
			if (symbol.equals("q")) {
				System.out.printf("최종 값 = %d\n", result);
				break;
			}

			System.out.println("값을 입력하세요.");
			System.out.print("NUM> ");
			int num = scan.nextInt();
			System.out.println();

			if (symbol.equals("+")) {
				System.out.printf("%d + %d = ", result, num);
				result = result + num;
				System.out.println(result);
				System.out.println();
			} else if (symbol.equals("-")) {
				System.out.printf("%d - %d = ", result, num);
				result = result - num;
				System.out.println(result);
				System.out.println();
			} else if (symbol.equals("*")) {
				System.out.printf("%d × %d = ", result, num);
				result = result * num;
				System.out.println(result);
				System.out.println();
			} else if (symbol.equals("/")) {
				System.out.printf("%d ÷ %d = ", result, num);
				result = result / num;
				System.out.println(result);
				System.out.println();
			} else {
				System.err.println("사칙연산 기호가 아닙니다!");
				System.out.println();
			}
		}
		
		System.out.println("종료");
		scan.close();
	}
}
