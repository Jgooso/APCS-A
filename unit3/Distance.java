package unit3;

//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		
	}

	public Distance(double x1, double y1, double x2, double y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(double x1, double y1, double x2, double y2)
	{
		xOne = 1;
		xTwo = 2;
		yOne = 1;
		yTwo = 1;
		
	}

	public void calcDistance()
	{
		distance = (Double)Math.sqrt(Math.pow(xOne - xTwo, 2) + Math.pow(yOne - yTwo, 2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void prdouble()
	{
		//System.out.println("distance = " + String.format("%.3f", distance));
	}
	
	//complete prdouble or the toString

	public String toString()
	{
		return String.format("%.3f", distance);
	}
}
