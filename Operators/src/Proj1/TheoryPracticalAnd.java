package rudraksh;

import java.util.Scanner;

public class TheoryPracticalAnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int Pr = sc.nextInt();

		if (T > 45 && Pr > 45) {
			System.out.println("Student has passed");
		} else if (T > 45 && Pr < 45) {
			System.out.println("Student has passed only theory");
		} else if (T < 45 && Pr > 45) {
			System.out.println("Student has passed only practical");
		} else {
			System.out.println("Student has failed");
		}
		sc.close();
	}

}
