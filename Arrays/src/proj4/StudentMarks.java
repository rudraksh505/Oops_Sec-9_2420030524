package proj4;


import java.util.Scanner;

class StudentMarks {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int[] marks = new int[6];
     int total = 0;
     
     System.out.println("Enter marks for 6 subjects:");
     for (int i = 0; i < 6; i++) {
         System.out.print("Subject " + (i + 1) + " marks: ");
         marks[i] = scanner.nextInt();
         total += marks[i];
     }
     
     System.out.println("\n--- Marks Report ---");
     for (int i = 0; i < 6; i++) {
         System.out.println("Subject " + (i + 1) + ": " + marks[i]);
     }
     
     double average = (double) total / 6;
     
     System.out.println("Total Marks: " + total);
     System.out.println("Average Marks: " + average);
     
     scanner.close();
 }
}