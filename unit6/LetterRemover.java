package unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		while(sentence.contains(Character.toString(lookFor))) {
			sentence = sentence.substring(0,sentence.indexOf(lookFor)) + sentence.substring(sentence.indexOf(lookFor)+1, sentence.length());
		}
		//System.out.print("done");
		String cleaned=sentence;
		return cleaned;
		
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}