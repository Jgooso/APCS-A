package unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		WordSortTwo word;
		Scanner file = new Scanner(new File("src/unit13/wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			word = new WordSortTwo(sentence);
			word.sort();
			System.out.print(word.toString());
			//instantiate a new WordSort
		}
	}
}
