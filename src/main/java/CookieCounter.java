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
        //create scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //asks for users input
        System.out.println("Please enter the the number of cookies eaten: ");
        
        //assign the variable n
        int numberOfCookies = keyboard.nextInt();
        
        //print results
        System.out.println("The amount of calories eaten was: " + (75*numberOfCookies) + " calories.");
        
        
    }
}
