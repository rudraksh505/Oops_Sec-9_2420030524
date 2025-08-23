package Cond;

import java.util.Scanner;

class Posnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number to check if it's positive: ");
        int num1 = scanner.nextInt();
        if (num1 > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
