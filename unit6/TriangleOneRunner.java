package unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne triangle = new TriangleOne();	
		triangle.setWord("hippo");
		triangle.print();
		System.out.println();
		triangle.setWord("abcd");
		triangle.print();
		System.out.println();
		triangle.setWord("it");
		triangle.print();
		System.out.println();
		triangle.setWord("a");
		triangle.print();
		System.out.println();
		triangle.setWord("chicken");
		triangle.print();
	}
}