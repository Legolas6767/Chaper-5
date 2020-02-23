
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trey-
 */
public class SumofNumbers {
    

public static void main(String[] args) {
		// Declare variable to hold user input
		int num;
		
		// Prompt user for positive nonzero integer value and store in variable.
		String input1 = JOptionPane.showInputDialog("Enter a positive nonzero integer");
		
		// Convert input1 to data-type int
		num = Integer.parseInt(input1);
		
		// Declare variable to hold sum
		int sum = 0;
		
		// Construct for loop to obtain the sum of integers from 1 up to the users input.
		while(num >= 1){
			sum += num;
			num--;
		}
		JOptionPane.showMessageDialog(null, "Sum: " + sum);
		
	}
}