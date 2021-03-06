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

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		hours = hrs;
		distance = dist;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = (double)distance/((double)minutes/60+hours);
	}

	public void print()
	{
		System.out.print(distance + " in " + hours + " hours and " + minutes + " minutes = " + Math.round(mph) + " MPH");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "mph";
	}
}
