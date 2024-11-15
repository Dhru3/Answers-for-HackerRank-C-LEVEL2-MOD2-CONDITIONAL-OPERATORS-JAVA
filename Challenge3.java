//Check whether the given character is in upper case or lower case

import java.util.*;

public class Challenge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >='a' && ch<='z'){
            System.out.println("LOWERCASE");
        }
        
        else if(ch >='A' && ch<='Z'){
            System.out.println("UPPERCASE");
        }
        
        else{
            System.out.println("INVALID");
        }
    }
}