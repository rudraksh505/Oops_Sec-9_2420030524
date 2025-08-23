package Cond;

import java.util.Scanner;
class AcceptNumbers {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int num;
     System.out.println("Enter numbers. Enter 0 to stop.");
     do {
         System.out.print("Enter a number: ");
         num = scanner.nextInt();
     } while (num != 0);
     System.out.println("Exiting program.");
     scanner.close();
 }
}