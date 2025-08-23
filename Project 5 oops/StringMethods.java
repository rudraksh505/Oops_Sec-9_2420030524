package proj5;

import java.util.Scanner;
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        scanner.close();

        System.out.println("String 1: \"" + s1 + "\"");
        System.out.println("String 2: \"" + s2 + "\"");
        System.out.println("1. length()");
        System.out.println("   s1.length(): " + s1.length());
        System.out.println("   s2.length(): " + s2.length());
        if (s1.length() > 0) {
            System.out.println("\n2. charAt(int index)");
            System.out.println("   s1.charAt(0): " + s1.charAt(0));
        }
        if (s1.length() > 1) {
            System.out.println("\n3. substring(int beginIndex)");
            System.out.println("   s1.substring(1): \"" + s1.substring(1) + "\"");
        }
        if (s1.length() > 2) {
            System.out.println("\n4. substring(int beginIndex, int endIndex)");
            System.out.println("   s1.substring(1, 3): \"" + s1.substring(1, Math.min(s1.length(), 3)) + "\"");
        }

        System.out.println("\n5. equals(String anotherString)");
        System.out.println("   s1.equals(s2): " + s1.equals(s2));

        System.out.println("\n6. equalsIgnoreCase(String anotherString)");
        System.out.println("   s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));

        System.out.println("\n7. compareTo(String anotherString)");
        System.out.println("   s1.compareTo(s2): " + s1.compareTo(s2));

        System.out.println("\n8. compareToIgnoreCase(String anotherString)");
        System.out.println("   s1.compareToIgnoreCase(s2): " + s1.compareToIgnoreCase(s2));

        System.out.println("\n9. contains(CharSequence s)");
        System.out.println("   s1.contains(s2): " + s1.contains(s2));

        System.out.println("\n10. startsWith(String prefix)");
        System.out.println("    s1.startsWith(s2): " + s1.startsWith(s2));

        System.out.println("\n11. endsWith(String suffix)");
        System.out.println("    s1.endsWith(s2): " + s1.endsWith(s2));

        System.out.println("\n12. indexOf(String str)");
        System.out.println("    s1.indexOf(s2): " + s1.indexOf(s2));

        System.out.println("\n13. lastIndexOf(String str)");
        System.out.println("    s1.lastIndexOf(s2): " + s1.lastIndexOf(s2));

        System.out.println("\n14. trim()");
        System.out.println("    s1.trim(): \"" + s1.trim() + "\"");

        if (s1.length() > 0 && s2.length() > 0) {
            System.out.println("\n15. replace(char oldChar, char newChar)");
            System.out.println("    s1.replace(s1 first char, s2 first char): \"" + s1.replace(s1.charAt(0), s2.charAt(0)) + "\"");
        }

        System.out.println("\n16. replaceAll(String regex, String replacement)");
        System.out.println("    s1.replaceAll(s2, \"REPLACED\"): \"" + s1.replaceAll(s2, "REPLACED") + "\"");
        
        System.out.println("\n17. replaceFirst(String regex, String replacement)");
        System.out.println("    s1.replaceFirst(s2, \"REPLACED\"): \"" + s1.replaceFirst(s2, "REPLACED") + "\"");

        System.out.println("\n18. toLowerCase()");
        System.out.println("    s1.toLowerCase(): \"" + s1.toLowerCase() + "\"");

        System.out.println("\n19. toUpperCase()");
        System.out.println("    s1.toUpperCase(): \"" + s1.toUpperCase() + "\"");

        System.out.println("\n20. toCharArray()");
        System.out.println("    s1.toCharArray(): " + Arrays.toString(s1.toCharArray()));

        System.out.println("\n21. isEmpty()");
        System.out.println("    s1.isEmpty(): " + s1.isEmpty());
        System.out.println("    new String(\"\").isEmpty(): " + new String("").isEmpty());

        System.out.println("\n22. valueOf(anyType)");
        int number = 2025;
        String numberStr = String.valueOf(number);
        System.out.println("    String.valueOf(2025): \"" + numberStr + "\"");
    }
}