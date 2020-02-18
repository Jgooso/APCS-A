package unit5;


//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare word = new WordsCompare();
	   word.setWords("abe", "ape");
	   System.out.println(word.toString());
	   word.setWords("giraffe", "gorilla");
	   System.out.println(word.toString());
	   word.setWords("one", "two");
	   System.out.println(word.toString());
	   word.setWords("fun", "funny");
	   System.out.println(word.toString());
	   word.setWords("123", "19");
	   System.out.println(word.toString());
	   word.setWords("193", "1910");
	   System.out.println(word.toString());
	   word.setWords("goofy", "godfather");
	   System.out.println(word.toString());
	   word.setWords("funnel", "fun");
	   System.out.println(word.toString());

	}
}