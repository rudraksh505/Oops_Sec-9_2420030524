package proj4;

import java.util.Scanner;

class SmallestLargest {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the number of elements: ");
     int size = scanner.nextInt();
     
     if (size <= 0) {
         System.out.println("Invalid size.");
         scanner.close();
         return;
     }
     
     int[] numbers = new int[size];
     
     System.out.println("Enter the elements:");
     for (int i = 0; i < size; i++) {
         System.out.print("Element " + (i + 1) + ": ");
         numbers[i] = scanner.nextInt();
     }
     
     int smallest = numbers[0];
     int largest = numbers[0];
     
     for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] < smallest) {
             smallest = numbers[i];
         }
         if (numbers[i] > largest) {
             largest = numbers[i];
         }
     }
     
     System.out.println("Smallest element: " + smallest);
     System.out.println("Largest element: " + largest);
     
     scanner.close();
 }
}