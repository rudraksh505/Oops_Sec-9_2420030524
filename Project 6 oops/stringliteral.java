package Stringbuffer;

public class stringliteral {
	
	public static void main(String[] args) {
		 
        String str1 = "Java";
        String str2 = "Java";

        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        str2 = new String("Java");

        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
	}

	
	


