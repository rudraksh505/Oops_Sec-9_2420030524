package Stringbuffer;
import java.util.Scanner;

public class stringbuffermethodss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer("Hello");
        
        System.out.println("Enter any string value ");
        String str1 = new String(scanner.nextLine());
        
        // Using println for each line
        System.out.println("1. append: " + buffer.append(str1));
        System.out.println("2. insert: "+ buffer.insert(1,str1));
        System.out.println("3. replace: "+ buffer.replace(1,4,str1));
        System.out.println("4. delete: "+ buffer.delete(1,3));
        System.out.println("5. deleteCharAt: "+ buffer.deleteCharAt(5));
        System.out.println("6. reverse: "+ buffer.reverse());
        System.out.println("7. length: "+ buffer.length());
        System.out.println("8. capacity: "+ buffer.capacity());
        System.out.println("9. CharAt: "+ buffer.charAt(1));
        
        buffer.setCharAt(1, 'A');
        System.out.println("10. setCharAt: " + buffer);
        
        System.out.println("11. substring: "+ buffer.substring(1));
        System.out.println("12. substringstartend: "+ buffer.substring(2,3));
        System.out.println("13. toString: "+ buffer.toString());
        
        buffer.ensureCapacity(9);
        System.out.println("14. ensureCapacity: "+ buffer.capacity()); // Printing capacity to see the change
        
        buffer.setLength(15);
        System.out.println("15. setLength: "+ buffer);
        
        scanner.close(); 
    }
}