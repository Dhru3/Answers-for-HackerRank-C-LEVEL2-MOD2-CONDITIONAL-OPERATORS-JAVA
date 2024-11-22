//Write a C program to input amount from user and print minimum number of notes (Rs.500,100,50,20,10,5,2,1) required for the given amount in c programming.

import java.util.*;

public class Challenge9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denominations[] = new int[]{500, 100, 50, 20, 10, 5, 2, 1};
        int NoteCount[] = new int[9];
        
        int amount = sc.nextInt();
        
        for(int i=0; i<denominations.length; i++){
            if(amount>=denominations[i]){
                NoteCount[i]= amount/denominations[i];
                amount = amount%denominations[i];
            }
        }
        
        System.out.println("Total number of notes:");
        for(int i=0; i<denominations.length; i++){
            System.out.println(denominations[i] + " : " + NoteCount[i]);
        }
        
        sc.close();
    }
}