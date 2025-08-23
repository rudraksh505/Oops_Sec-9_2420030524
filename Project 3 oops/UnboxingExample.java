package proj3;


import java.util.Scanner;

class UnboxingExample {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter an integer value for unboxing: ");
     Integer wrapperInt = Integer.valueOf(scanner.nextInt());
     int primitiveInt = wrapperInt.intValue();

     System.out.print("Enter a double value for unboxing: ");
     Double wrapperDouble = Double.valueOf(scanner.nextDouble());
     double primitiveDouble = wrapperDouble.doubleValue();

     System.out.print("Enter a character value for unboxing: ");
     Character wrapperChar = Character.valueOf(scanner.next().charAt(0));
     char primitiveChar = wrapperChar.charValue();

     System.out.println("Wrapper Integer: " + wrapperInt + ", Unboxed int: " + primitiveInt);
     System.out.println("Wrapper Double: " + wrapperDouble + ", Unboxed double: " + primitiveDouble);
     System.out.println("Wrapper Character: " + wrapperChar + ", Unboxed char: " + primitiveChar);

     scanner.close();
 }
}
