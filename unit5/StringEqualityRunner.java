package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality string = new StringEquality();
		string.setWords("hello", "goodbye");
		System.out.println(string.toString());
		string.setWords("one", "two");
		System.out.println(string.toString());
		string.setWords("three", "four");
		System.out.println(string.toString());
		string.setWords("TCEA", "UIL");
		System.out.println(string.toString());
		string.setWords("State", "Champions");
		System.out.println(string.toString());
		string.setWords("ABC", "ABC");
		System.out.println(string.toString());
		string.setWords("ABC", "CBA");
		System.out.println(string.toString());
		string.setWords("Same", "Same");
		System.out.println(string.toString());
		
	}
}