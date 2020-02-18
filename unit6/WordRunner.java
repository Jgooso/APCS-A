package unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word wd = new Word();
		wd.setString("Hello");
		System.out.println(wd.toString() + "\n");
		wd.setString("World");
		System.out.println(wd.toString() + "\n");
		wd.setString("JukeBox");
		System.out.println(wd.toString() + "\n");
		wd.setString("TCEA");
		System.out.println(wd.toString() + "\n");
		wd.setString("UIL");
		System.out.println(wd.toString() + "\n");
		
	}
}