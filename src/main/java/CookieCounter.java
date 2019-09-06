/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author chase
 */
public class CookieCounter 
{
    public static void main(String[] args) 
    {
        int totalCaloriesPerCookie;
        int serving = 300;
        int numberOfServings = 10;
        int totalNumberOfCookies = 40;
        
        //calculates total calories per cookie
        totalCaloriesPerCookie = (serving * numberOfServings)/ totalNumberOfCookies;
        
        //create scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //asks for users input
        System.out.println("Please enter the the number of cookies eaten: ");
        
        //assign the variable n
        int numberOfCookies = keyboard.nextInt();
        
        //multiplies the amount of cookies by the total number of calories per cookie
        numberOfCookies = numberOfCookies * totalCaloriesPerCookie;
        
        //print results
        System.out.println("The amount of calories eaten was: " + (numberOfCookies) + " calories.");          
    }
}
