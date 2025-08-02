package proj3;


import java.util.Scanner;

class AutounboxingExample {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter an integer for auto-unboxing: ");
     Integer wrapperInt = Integer.valueOf(scanner.nextInt());
     int primitiveInt = wrapperInt;

     System.out.print("Enter a double for auto-unboxing: ");
     Double wrapperDouble = Double.valueOf(scanner.nextDouble());
     double primitiveDouble = wrapperDouble;

     System.out.print("Enter a boolean (true/false) for auto-unboxing: ");
     Boolean wrapperBoolean = Boolean.valueOf(scanner.next());
     boolean primitiveBoolean = wrapperBoolean;

     System.out.println("Wrapper Integer: " + wrapperInt + ", Auto-unboxed int: " + primitiveInt);
     System.out.println("Wrapper Double: " + wrapperDouble + ", Auto-unboxed double: " + primitiveDouble);
     System.out.println("Wrapper Boolean: " + wrapperBoolean + ", Auto-unboxed boolean: " + primitiveBoolean);

     scanner.close();
 }
}