/*
 A gift is a transfer of property to another person against no compensation or payment. 
 If the total value of the gifts you receive from the same donor in the course of 3 years is €5,000 or more, you must pay gift tax.

When a gift is given by a close relative or a family member, 
the amount of gift tax is determined by the following table :

Value of gift	    Tax at the lower limit	Tax rate(%) for exceeding part
5,000 — 25,000	    100	                    8
25,000 — 55,000	    1,700	                10
55,000 — 200,000	4,700	                12
200,000 — 1,000,000	22,100	                15
1,000,000 —	        142,100	                17

For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), 
and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).

*/

import java.util.Scanner;

public class GiftTax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int x = Integer.valueOf(sc.nextLine());
        double gt;
        
        if(x>=1000000){
            gt = (142100+(x-1000000)*0.17);
            
        }else if(x>=200000){
            gt = (22100+(x-200000)*0.15);

        }else if(x>=55000){
            gt = (4700+(x-55000)*0.12);

        }else if(x>=25000){
            gt = (1700+(x-25000)*0.10);

        }else if(x>=5000){
            gt = (100+(x-5000)*0.08);

        }else{
            System.out.println("No tax!");
            return;
        }
        System.out.println("Tax: "+gt);
    }
}