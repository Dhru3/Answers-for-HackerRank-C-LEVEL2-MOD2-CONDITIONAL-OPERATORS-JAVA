// Get three inputs in the format-integer,character,integer. The inputs are all seperated by spaces. 
//Perform the operation with the integer values based on the character(+,-,*,/). Display the calculated value as the output.

import java.util.*;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int b = sc.nextInt();
        
        switch(o){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}