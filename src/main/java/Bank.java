
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
public class Bank {
    


	public static void main(String[] args) {
		
		//Bank Charges 
		double BanksFee 	 = 10.00; // PER MONTH
		double LessThan20	 = 0.10 ;
		double Between20_39  = 0.08 ; 
		double Between40_59	 = 0.06 ;
		double MoreThan60 	 = 0.04 ;
		double TotalFee		 = 0	;
		int    Checks		 = 0 	;
		
		
		//ASKING USER 
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the number of checks written this month:");
		Checks = userInput.nextInt();
		
		if ( Checks < 20){
			TotalFee = (Checks * LessThan20) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
		}
		
		else if (Checks == 20 || Checks < 40) {
			TotalFee = (Checks * Between20_39) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
		else if (Checks == 40 || Checks < 60) {
			TotalFee = (Checks * Between40_59) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
		else if (Checks > 60) {
			TotalFee = (Checks * MoreThan60) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
	}

}