package rudraksh;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int resultAnd = a & b;
		System.out.println("a & b = " + resultAnd);

		int resultOr = a | b;
		System.out.println("a | b = " + resultOr);

		int resultXor = a ^ b;
		System.out.println("a ^ b = " + resultXor);

		int complementA = ~a;
		System.out.println("~a = " + complementA);

		int complementB = ~b;
		System.out.println("~b = " + complementB);

		scanner.close();
	}
}