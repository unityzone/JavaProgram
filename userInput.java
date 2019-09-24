
package javaapp;

import java.util.Scanner;


public class userInput {
    
    public static void main(String[] args){
        
        int number;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
        
        number = input.nextInt();
        
        System.out.println("The number is : " + number);
        
        
    }
    
}
