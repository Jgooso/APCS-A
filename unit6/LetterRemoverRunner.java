package unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover letter = new LetterRemover();
		letter.setRemover("I am Sam I am", 'a');
		System.out.println("I am Sam I am - letter to remove a");
		System.out.println(letter.removeLetters());
		letter.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println("ssssssssxssssesssssesss - letter to remove s");
		System.out.println(letter.removeLetters());
		letter.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println("qwertyqwertyqwerty - letter to remove a");
		System.out.println(letter.removeLetters());
		letter.setRemover("abababababa", 'b');
		System.out.println("abababababa - letter to remove b");
		System.out.println(letter.removeLetters());
		letter.setRemover("abaababababa", 'x');
		System.out.println("abaababababa - letter to remove x");
		System.out.println(letter.removeLetters());


		System.out.println(letter.removeLetters());
		//add test cases		
											
	}
}