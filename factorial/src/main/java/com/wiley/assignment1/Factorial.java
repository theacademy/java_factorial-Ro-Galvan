package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {
		 
		/*
		- Update this method to accept a number from the user and store the value in an instance variable `num`. 
			- Use an instance variable `scanner` to accept the input from the user.
		
		- If the input value is valid, return the number input by the user (NOT the factorial of the number).
		
		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
			
		- All code should be inside the placeholders below.
		*/

		//YOUR CODE STARTS HERE
//		int num = scanner.nextInt();
		String userResponse = scanner.next();
		 System.out.println("this is the userResponse: " + userResponse);
//		if (userResponse.matches("-?\\d+(\\.\\d+)?")) {
//		 added try catch exception to handle the NumberFormatException- had to google for help with implementing since I forgot
		 try {
			int num = Integer.parseInt(userResponse);
			System.out.println("this is the num: " + num);
			if (num >= 1 && num <= 10) {
				return num;
			} else {
//				I had to replace the sentence with the key from the Tests--I messaged Shams about this
				this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
//				this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
				return -1;
			}
//			repeating the above (similar to else statement) if it runs into a number exception this code block will execute
		} catch (NumberFormatException exception) {
			 this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
//				this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
			 return -1;
		 }

		//YOUR CODE ENDS HERE

			
	 }
	
	 
	 private void calculateFactorial(int num) {
		
		  /*
		  Use this method to calculate the factorial of the number input by the user.
		  
		  - All code should be inside the placeholders below.
		*/
		 
		int result = 1;
		//YOUR CODE STARTS HERE
//		take the user num and put in an array so it loops and executes 1 - num then multiply to get result
		 for (int i = 1; i <= num; i++) {
			 System.out.println(i);
			 result = result * i;
		 }
 

		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);		
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive");
		fact.calculateFactorial();	
	 }

	
}
