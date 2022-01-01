package arithmeticPackage;

import java.util.*;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		//variable declaration
		double firstNumber, secondNumber;
		char operator, choice;
		
		do
		{
			//scanner class
			Scanner scan = new Scanner(System.in);
		
			//first number input
			System.out.println("Enter the first number: ");
			firstNumber = scan.nextDouble();
		
			//second number input
			System.out.println("Enter the second number: ");
			secondNumber = scan.nextDouble();
		
			//operator input
			System.out.println("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \nEnter an operation: ");
			operator = scan.next().charAt(0);

			//switch case
			switch(operator)
			{	
				//addition
				case '1': System.out.println("The sum is: " + (firstNumber + secondNumber));
							break;
		
				//subtraction
				case '2': System.out.println("The difference is: " + (firstNumber - secondNumber));
					  		break;
		  	 
				//multiplication
				case '3': System.out.println("The product is: " + (firstNumber * secondNumber));
							break;
			
				//division
				case '4': System.out.println("The remainder is: " + (firstNumber / secondNumber));
			  		  		break;
			  
				default: System.out.println("Invalid operator !!");
			}
		
			System.out.println("Do you want to continue (y/n):");
			choice = scan.next().charAt(0);
		}
		while(choice == 'y');		
	}

}
