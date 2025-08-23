package Cond;
import java.util.Scanner;

//2. Check if a number is even or odd.
class Evenodd {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = scanner.nextInt();
     if (num % 2 == 0) {
         System.out.println("The number is even.");
     } else {
         System.out.println("The number is odd.");
     }
     scanner.close();
 }
}