package unit4;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	
	public static void main ( String[] args )
	{
		Scanner myObj = new Scanner(in);
		//add in input
		out.println("Enter a whole number :: ");
		int number = myObj.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number)  + "\n");
		
		//add in more test cases
		number = 111;
		out.println("Enter a whole number :: " + number);
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number) + "\n");
		
		number = 2000;
		out.println("Enter a whole number :: " + number);
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number)  + "\n");
		
		number = -99;
		out.println("Enter a whole number :: " + number);
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number)  + "\n");
		
		number = 1111;
		out.println("Enter a whole number :: " + number);
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number)  + "\n");
		
		number = -850;
		out.println("Enter a whole number :: " + number);
		
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number)  + "\n");
	}
}