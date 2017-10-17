/****************************************************************************
 *
 * Created on : 14 Oct. 2017
 * Created for : ICS3UR
 * Weekly Assignment - Assignment #3
 * # This program calculates the cost of a pizza with the diameter inputed by user
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.*;

public class assignment3b 
{
    //constants
    static double HST = 0.13;    
    static double finalHST = 0.00;
    static double subTotal = 0.00;

    public static void main(String[] args)
    {
       try 
       {
        double pizzaSize;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type '1' if you would like a large pizza.");
        System.out.println("Type '2' if you would like an extra large pizza.");
        
        pizzaSize = Double.parseDouble(br.readLine());          
        
        double numberOfToppings;
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type in how many toppings you would like (You can choose a max. of 4 toppings)");
        
        numberOfToppings = Double.parseDouble(br2.readLine()); 
             
        if (pizzaSize == 1)
           {
            subTotal = 6.00;
           }       
        else if (pizzaSize == 2)
           {
            subTotal = 10.00;
           }
                                  
        if (numberOfToppings == 1)
           {
            subTotal = subTotal + 1.00;
           }
        else if (numberOfToppings == 2)
           {
            subTotal = subTotal + 1.75;
           }
        else if (numberOfToppings == 3)
           {
            subTotal = subTotal + 2.50;
           }
         else if (numberOfToppings == 4)
           {
            subTotal = subTotal + 3.25;
           }
                  
             double finalHST = HST * subTotal;
             double totalCost = subTotal + finalHST;
             finalHST = Math.round(finalHST * 100)/100D;
             totalCost = Math.round(totalCost * 100)/100D;
             System.out.println("Subtotal : $ " + subTotal);
             System.out.println("HST : $ " + finalHST);
             System.out.println("Total Cost : $ " + totalCost);
        } 
        catch(Exception nfe) 
        {
            System.err.println("Invalid input!");
        }  
    }
}
