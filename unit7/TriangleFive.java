package unit7;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = 'a';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	public void makeTriangle() {
		/*
		for(int z = amount; z > 0; z--) {
			
			for(int i = z; i > 0; i--) {
				for(int x = amount; x > 0; x --) {
					for(int b = 0; b > x; b++) {
						System.out.print(letter);
					}
					//System.out.print(letter);
				}
				System.out.print(" ");
				letter +=1;
			}
			letter-= z;
			System.out.println();
		}*/
		for(int z = 0; z < amount; z++) {
			for(int i = amount; i > z; i--) {
				for(int x = 0; x < i; x++) {
					
					System.out.print(letter );
					
					
				}
				letter+=1;
				if(letter > 'Z') 
					letter = (char)('A' + (letter - 'Z'-1));
				System.out.print(" ");
				
				
			}
			letter -= amount-z;
			if(letter < 'A') {
				letter = (char)('Z' - ('A' - letter)+1);
			}
			
			System.out.println();
			
			
		}
	}

	public String toString()
	{
		String output="";
		return output;
	}
}