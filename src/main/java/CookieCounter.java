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
        float totalCaloriesPerCookie;
        float caloriesPerServing = 300;
        float numberOfServings = 10;
        float totalNumberOfCookies = 40;
        float numberOfCookies;
               
        //create scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //asks for users input
        System.out.println("Please enter the the number of cookies eaten: ");
        
        //assign input to variable
        numberOfCookies = keyboard.nextInt();
        
        //multiplies the amount of cookies by the total number of calories per cookie
        totalCaloriesPerCookie = (caloriesPerServing * numberOfServings)/ totalNumberOfCookies;
        numberOfCookies = numberOfCookies * totalCaloriesPerCookie;
        
        //print results
        System.out.println("The amount of calories eaten was: " + (numberOfCookies) + " calories.");          
    }
}
