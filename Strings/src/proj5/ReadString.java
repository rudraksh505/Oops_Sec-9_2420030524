package proj4;


import java.util.Scanner;

class ReadString {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String userInput = scanner.nextLine();
     System.out.println("You entered: " + userInput);
     scanner.close();
 }
}