package proj4;

import java.util.Scanner;

class StringMethods {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the first string: ");
     String str1 = scanner.nextLine();

     System.out.print("Enter the second string: ");
     String str2 = scanner.nextLine();

     String str3 = "  Trim me   ";
     
     System.out.println("\n--- String Methods Demonstration ---");
     
     System.out.println("1. length(): " + str1.length());
     System.out.println("2. charAt(2): " + str1.charAt(2));
     System.out.println("3. substring(4): " + str1.substring(4));
     System.out.println("4. substring(2, 5): " + str1.substring(2, 5));
     System.out.println("5. equals(str2): " + str1.equals(str2));
     System.out.println("6. equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
     System.out.println("7. compareTo(str2): " + str1.compareTo(str2));
     System.out.println("8. compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2));
     System.out.println("9. contains(\"llo\"): " + str1.contains("llo"));
     System.out.println("10. startsWith(\"He\"): " + str1.startsWith("He"));
     System.out.println("11. endsWith(\"o\"): " + str1.endsWith("o"));
     System.out.println("12. indexOf(\"o\"): " + str1.indexOf("o"));
     System.out.println("13. lastIndexOf(\"o\"): " + str1.lastIndexOf("o"));
     System.out.println("14. trim(): '" + str3.trim() + "'");
     System.out.println("15. replace('o', 'a'): " + str1.replace('o', 'a'));
     System.out.println("16. replaceAll(\"ll\", \"rr\"): " + str1.replaceAll("ll", "rr"));
     System.out.println("17. replaceFirst(\"l\", \"L\"): " + str1.replaceFirst("l", "L"));
     System.out.println("18. toLowerCase(): " + str1.toLowerCase());
     System.out.println("19. toUpperCase(): " + str1.toUpperCase());
     
     char[] charArray = str1.toCharArray();
     System.out.print("20. toCharArray(): ");
     for (char c : charArray) {
         System.out.print(c + " ");
     }
     System.out.println();
     
     System.out.println("21. isEmpty(): " + str1.isEmpty());
     System.out.println("22. valueOf(123): " + String.valueOf(123));

     scanner.close();
 }
}