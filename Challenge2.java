// Check whether the given character is an alphabet or a number or special character

import java.util.*;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);  

        if ((ch >= 'A' && ch <= 'Z')) {
            System.out.println("ALPHABET");}
        else if ((ch >= 'a' && ch <= 'z')) {  
            System.out.println( "ALPHABET");} 
        else if (ch >='0' && ch <='9'){
            System.out.println("NUMBER");}
        else{
            System.out.println("SPECIAL CHARACTER");}
    }
}