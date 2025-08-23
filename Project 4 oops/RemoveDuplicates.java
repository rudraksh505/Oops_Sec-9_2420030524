package proj4;


import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {
 public static void main(String[] args) {
     int[] numbers = {10, 20, 30, 10, 40, 20, 50};
     
     Set<Integer> uniqueElements = new HashSet<>();
     
     for (int number : numbers) {
         uniqueElements.add(number);
     }
     
     System.out.println("Unique elements in the array:");
     for (int uniqueNumber : uniqueElements) {
         System.out.println(uniqueNumber);
     }
 }
}