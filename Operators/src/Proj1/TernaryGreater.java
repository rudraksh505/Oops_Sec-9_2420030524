
package rudraksh;

import java.util.Scanner;

public class TernaryGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();

		int num2 = sc.nextInt();

		int greaterNumber = (num1 > num2) ? num1 : num2;

		System.out.println("\nThe greater number is: " + greaterNumber);

		sc.close();
	}
}
