// Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:
//For first 50 Units Rs.0.50/unit

//For next 100 Units Rs.0.75/unit

//For next 100 Units Rs.1.20/unit

//For unit above 250 Rs.1.50/unit

//An additional surcharge of 20% is added to the bill.

import java.util.*;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double cost = 0.0;
        if (units <= 50){
            cost= units*0.50 ;
        }
        
        else if(units>50 && units <=150){
            cost = 25 + ((units-50)*0.75);
        }
        
        else if(units>150 && units <=250){
            cost = 100 + ((units-150)*1.20);
        }
        
        else if(units>250){
            cost= 220 +((units-250)*1.50);
        }
        
        cost = cost + (cost*0.2);
        System.out.printf("%.2f",cost);
    }
}