package unit11;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	
	public static void main( String args[] )
	{
		String[] array = {"a","box","toad","fishy","dog"};
		int i = 0;
		String input = "";
		Scanner keyboard = new Scanner(System.in);
		while(input != "n")
		{
			input = array[i];
			System.out.print("Enter a word :: " + input + "\n");
			TriangleWord.printTriangle(input);
			System.out.print("Do you want to enter more sample input?  ");
			if(i < array.length-1) {
				input = "y";
			System.out.print(input + "\n");
			}else {
				input = "n";
				System.out.print(input + "\n");
			}
			i++;
		}	
		
	}
}