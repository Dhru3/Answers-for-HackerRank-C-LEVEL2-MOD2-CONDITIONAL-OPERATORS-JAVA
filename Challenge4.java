//Input all angles of a Triangle and check whether it is Valid or Not Valid

import java.util.*;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        if (a+b+c==180){
            System.out.println("Valid");
        }
        
        else{
            System.out.println("Not Valid");
        }
        
    }
}