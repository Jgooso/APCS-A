package unit11;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int top;
	private int bottom;
	//write two constructors
	Rational(int top, int bottom){
		this.top = top;
		this.bottom = bottom;
	}
	Rational(){
		top = 1;
		bottom = 1;
	}

	//write a setRational method
	public void setRational(int top, int bottom){
		this.top = top;
		this.bottom = bottom;
	}

	//write  a set method for numerator and denominator
	public void setTop(int top) {
		this.top = top;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		top = (this.top*other.bottom) + (other.top*this.bottom);
		bottom = (this.bottom * other.bottom);
		reduce();
	}

	
	private void reduce()
	{
		int gcd = gcd(top,bottom);
		top = top/gcd;
		bottom = bottom/gcd;


	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for(int x = min; x>0; x--) {
			if(numOne%x ==0 && numTwo%x ==0) {
				return x;
			}
		}
		return 1;
	}

	public Object clone ()
	{
		
		return new Rational(top, bottom);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getTop() {
		return top;
	}
	public int getBottom() {
		return bottom;
	}
	public boolean equals( Object obj)
	{
		Rational rat = (Rational)obj;
		if((double)top/(double)bottom == (double)rat.top/(double)rat.bottom) {
			return true;
		}
		return false;
	}

	
	public int compareTo(Rational other)
	{
		double otherValue = (double)(other.top)/(double)(other.bottom);
		double thisValue = (double)(top)/(double)(bottom);
		if(otherValue > thisValue) {
			return -1;
		}else {
			return 1;
		}
	}



	
	//write  toString() method
	public String toString() {
		return top + "/" + bottom;
	}
	
}