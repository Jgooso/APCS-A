package unit7;

//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
  

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = 0;

	}

	public void setNum(int num)
	{
		number = num;

	}
	public void getTriples() {
		for(int i = 1; i <= number; i++) {
			
			
			for(int x = 1;x <= number; x++) {
				cloop:
				for(int z = 1; z <= number; z++) {
					//greatestCommonFactor(z,x,i);
					
					if(greatestCommonFactor(i,x,z) == 0) {
						System.out.println( i + " " + x + " " + z );
						break cloop;
					}
					
					
				}
			}
		}
		
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		if(c < b || c < a || b < a) {
			return 1;
		}
		
		
		
		for(int i = 2; i < (a+b+c)-1; i++) {
			if(b%i ==0 && a%i == 0 && c%i == 0) {
				return 1;
				
			}
		}
				if((a%2 != b%2) || c%2 != 0) {
					
				
					
					if((a*a)+(b*b)==c*c) {
						
						return 0;
						
					}
				}
						
			
		
			
			
				
			
		


		//return 1;
		
		return 1;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}