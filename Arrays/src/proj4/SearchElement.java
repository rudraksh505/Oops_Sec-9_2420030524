package proj4;

import java.util.Scanner;

class SearchElement {
 public static void main(String[] args) {
     int[] numbers = {10, 25, 30, 45, 50, 60};
     Scanner scanner = new Scanner(System.in);
     boolean found = false;
     
     System.out.print("Enter the element to search for: ");
     int searchElement = scanner.nextInt();
     
     for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] == searchElement) {
             System.out.println("Element " + searchElement + " found at index " + i);
             found = true;
             break;
         }
     }
     
     if (!found) {
         System.out.println("Element " + searchElement + " not found in the array.");
     }
     
     scanner.close();
 }
}