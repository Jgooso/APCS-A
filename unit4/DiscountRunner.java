package unit4;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount disc = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.println("Amount after discout :: " + ((double)Math.round(disc.getDiscountedBill(amt)*100))/100 + "\n");
		
		amt = 500;
		out.println("Enter the original bill amount :: "+ amt);
		out.println("Amount after discout :: " + ((double)Math.round(disc.getDiscountedBill(amt)*100))/100 + "\n");
	
		amt = 2500;
		out.println("Enter the original bill amount :: "+ amt);
		out.println("Amount after discout :: " + ((double)Math.round(disc.getDiscountedBill(amt)*100))/100 + "\n");
		
		amt = 4000;
		out.println("Enter the original bill amount :: "+ amt);
		out.println("Amount after discout :: " + ((double)Math.round(disc.getDiscountedBill(amt)*100))/100 + "\n");
		
		amt = 333.333;
		out.println("Enter the original bill amount :: "+ amt);
		out.println("Amount after discout :: " + ((double)Math.round(disc.getDiscountedBill(amt)*100))/100 + "\n");
		
		amt = 95874.2154;
		out.println("Enter the original bill amount :: " + amt);
		out.println("Amount after discout :: " + ((double)Math.round(disc.getDiscountedBill(amt)*100))/100 + "\n");
		

	}
}