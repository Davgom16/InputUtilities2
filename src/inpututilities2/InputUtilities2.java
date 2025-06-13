/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututilities2;

import java.util.Scanner;

/**
 * HDIP Feb 2025
 * 
 * InputUtiiities
 * 
 *  1) askUserForText(String) -- prompt user for text input & validate
 * 
 *  2) askUserForInt (String) -- prompt user for an integer value & validate
 * 
 * 
 * @author kheal
 */
public class InputUtilities2 {
    
    /**
     * ask the user to enter some text - no numbers!
     * @param prompt is the question or prompt for the user
     * @return valid text entered by the user 
     */
    public String askUserForText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput;
        
        do{
            // issue prompt to user and get input
            System.out.println(prompt);
            userInput = myKB.nextLine();
            
            //keep going while input not valid text
        }while (!userInput.matches("[a-zA-Z!.?,-]"));
        
        //input must be valid text
        return (userInput);
    }
    
    /**
     * ask the user to enter an integer value
     * @param prompt is the question or prompt to the user
     * @return a valid int entered by the user
     */
    public int askUserForInt(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput;
        
        do{
            // issue prompt to user and get input
            System.out.println(prompt);
            System.out.println("You must enter an integer value.");
            userInput = myKB.nextLine();
            
            //keep going while input not valid text
        }while (!userInput.matches("[0-9]+"));
        
        //input must be valid int
        return (Integer.parseInt(userInput));
    }
    
    /**
     * Ask the user to enter an integer greater than a given minimum value
     * @param prompt the question or prompt to the user
     * @param minValue the lowest value that is allowed
     * @param maxValue the lowest value that is allowed
     * @return a valid int greater or equal to minValue 
     */
    public int askUserForInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput = minValue -1;  //default to a value that is definitely not allowed
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter an integer between " + minValue + "andd " + maxValue);
            try {
                userInput = myKB.nextInt();
                
            }catch(Exception e){
                //must be non-integer input
                System.out.println("That was not an integer value");
                myKB.nextLine();
            }
            
        } while ( (userInput < minValue) || userInput > maxValue);
        
        return userInput; // the userInput must be a number bigger or equal to minValue
    }
}
