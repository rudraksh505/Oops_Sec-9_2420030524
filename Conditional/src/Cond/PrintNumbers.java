package Cond;

import java.util.Scanner;


class PrintNumbers {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number N: ");
     int n = scanner.nextInt();
     for (int i = 1; i <= n; i++) {
         System.out.println(i);
     }
     scanner.close();
 }
}
