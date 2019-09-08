/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.NumberFormat;
import java.util.Scanner;
/**
 *
 * @author chase
 */
public class SalesTax
{
    public static void main(String[] args) 
    {
        //Constants
        final float STATE_RATE = 0.04F;
        final float COUNTY_RATE = 0.02F;
        
        //Variables
        float purchase;
        float stateTax;
        float countyTax;
        float totalTax;
        float totalCost;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumFractionDigits(2);
        
        //scanner for users input
        Scanner keyboard = new Scanner(System.in);
        
        //get the purchase amount
        System.out.println("Please enter the purchase amount: ");
        purchase = keyboard.nextFloat();
        
        //calculate the state sales tax
        stateTax = purchase * STATE_RATE;
        
        //calculate county sales tax
        countyTax = purchase * COUNTY_RATE;
        
        //calculate the total sales tax
        totalTax = stateTax + countyTax;
        
        //calculate total purchase tax
        totalCost = purchase + totalTax;
        
        //displaying results of the calculations
        System.out.println("Purchase amount is: $ " + (numberFormat.format(purchase)));
        System.out.println("State Tax is: $ " + (numberFormat.format(stateTax)));
        System.out.println("CountyTax is: $ " + (numberFormat.format(countyTax)));
        System.out.println("Total tax is: $ " + (numberFormat.format(totalTax)));
        System.out.println("Total Cost is: $ " + (numberFormat.format(totalCost)));
        
    }
}
