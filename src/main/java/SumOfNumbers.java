
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jfortney
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    //variables
    int num = 0, sum = 0;
    
    //user input
        System.out.println("Enter a positive non-zero number");
        num = input.nextInt();
    
    //loop
    for (int i = 1; i <= num; i++)
    sum = sum +i;
    
        System.out.println("Sum is equal to " + sum);
        
    input.close();
    
                
    }
}