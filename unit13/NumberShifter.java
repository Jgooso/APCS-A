package unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	static int[] array1;
	public static int[] makeLucky7Array( int size)
	{
		
		return new int[size];
	}
	public static void shiftEm(int[] array)
	{
		int count = 0;
		array1 = new int[array.length];
		
		
		for(int i = 0; i < array.length;i++) {
			if(array[i] == 7) {
				array1[count] = array[i];
				count++;
			}
		}
		
		for(int i = 0; i < array.length;i++) {
			if(array[i] != 7) {
				array1[count] = array[i];
				count++;
			}
		}
		
		
		
	}
}
