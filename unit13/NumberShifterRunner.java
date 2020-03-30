package unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		
		int[] array1 = NumberShifter.makeLucky7Array(10);
		
		for(int i = 0; i < array1.length;i++) {
			array1[i] = new Random().nextInt(10);
		}
		
		
		for(int i = 0; i < array1.length;i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
		NumberShifter.shiftEm(array1);
		array1 = NumberShifter.array1;
		for(int i = 0; i < array1.length;i++) {
			System.out.print(array1[i]);
		}
	}
}



