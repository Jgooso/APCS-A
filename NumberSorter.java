package unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number > 0) {
			number = number/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int i = 0;
		int sort;
		int[] sorted = new int[getNumDigits(number)];
		while(number > 0) {
			sorted[i] = number%10;
			number = number/10;
			i++;
		}
		for(int x = 0; x< sorted.length-1;x++) {
			if(sorted[x] > sorted[x+1]) {
				sort = sorted[x+1];
				sorted[x+1] = sorted[x];
				sorted[x] = sort;
				if(x >= 1) {
				x -= 2;
				}else {
				x--;
				}
			}
		}
		return sorted;
	}
}