
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trey-
 */
public class Barchart {
    

public static void main(String[] args)
	{
		double[] store = new double[5];
		
		
    try (Scanner userInput = new Scanner(System.in)) {
        for(int i = 0; i < 5; i++)
        {
            System.out.printf("Enter today\'s sales for store %d: ", i + 1);
            store[i] = userInput.nextDouble();
        }
        
        System.out.println("\nSALES BAR CHART");
        
        for(int i = 0; i < 5; i++)
        {
            System.out.printf("Store %d: ", i + 1);
            
            for(int c = 0; c < store[i]/100; c++)
                System.out.print("*");
            
            System.out.println();
        }
    }
	}
}