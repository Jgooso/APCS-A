package unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
	int total = 0;
   private int number;
   String perfect;

	//add constructors
   public Perfect() {
	number = 0;
   }
	//add a set method
   public void setNumber(int num) {
	   number = num;
	   total = 0;
   }
	public boolean isPerfect()
	{
		
		for(int i = 1; i < number-1; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		if(total == number)
			return true;
		else
		return false;
	}

	//add a toString	
	public String toString() {
		if(isPerfect() == true) {
			perfect = " is perfect";
		}else
			perfect = " is not perfect";
		return number + perfect;
		
	}
	
}