
package javaapp;

import java.util.Scanner;

public class evenOdd {
    
    public static void main(String[] args){
        
        int num;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        num = input.nextInt();
        
        if(num%2 == 0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    
    }
    
}
