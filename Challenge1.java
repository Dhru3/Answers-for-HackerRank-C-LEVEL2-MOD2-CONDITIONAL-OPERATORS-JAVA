//Check whether the given character is a Vowel or Consonant

import java.util.*;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        char ch = scanner.next().toLowerCase().charAt(0);  // Convert to lowercase to handle both cases

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else if ((ch >= 'a' && ch <= 'z')) {  // Check if it's an alphabet
            System.out.println( "Consonant");
        } else {
            System.out.println(ch + " is not a valid alphabet character.");
        }
    }
}