package proj4;


import java.util.Scanner;

class DynamicArray {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the number of elements: ");
     int size = scanner.nextInt();
     
     int[] elements = new int[size];
     
     System.out.println("Enter the elements:");
     for (int i = 0; i < size; i++) {
         System.out.print("Element " + (i + 1) + ": ");
         elements[i] = scanner.nextInt();
     }
     
     System.out.println("The elements you entered are:");
     for (int element : elements) {
         System.out.println(element);
     }
     
     scanner.close();
 }
}