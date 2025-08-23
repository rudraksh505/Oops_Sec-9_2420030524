package proj3;
import java.util.Scanner;

class BoxingExample {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter an integer: ");
     int primitiveInt = scanner.nextInt();
     Integer wrapperInt = Integer.valueOf(primitiveInt);

     System.out.print("Enter a double: ");
     double primitiveDouble = scanner.nextDouble();
     Double wrapperDouble = Double.valueOf(primitiveDouble);
     
     System.out.print("Enter a character: ");
     char primitiveChar = scanner.next().charAt(0);
     Character wrapperChar = Character.valueOf(primitiveChar);

     System.out.println("Primitive int: " + primitiveInt + ", Boxed Integer: " + wrapperInt);
     System.out.println("Primitive double: " + primitiveDouble + ", Boxed Double: " + wrapperDouble);
     System.out.println("Primitive char: " + primitiveChar + ", Boxed Character: " + wrapperChar);

     scanner.close();
 }
}