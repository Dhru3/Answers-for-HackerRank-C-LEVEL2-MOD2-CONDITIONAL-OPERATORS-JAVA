//Write a program to Check whether a triangle is Equilateral or Isosceles or Scalene based on length of three sides.

import java.util.*;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a==b && b==c && c==a){
            System.out.println("Equilateral");
        }
        
        else if( a==b || b==c || c==a){
            System.out.println("Isosceles");
        }
        
        else if( a!=b && b!=c && c!=a){
            System.out.println("Scalene");
        }
    }
}