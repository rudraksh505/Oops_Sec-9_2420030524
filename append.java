package Stringbuffer;


public class append {
    public static void main(String[] args) {
        
        StringBuffer buffer = new StringBuffer("Hello");

        
        System.out.println("Before appending: " + buffer);

        
        buffer.append(" World");

        
        System.out.println("After appending: " + buffer);
    }
}
