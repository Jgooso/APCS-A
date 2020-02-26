package unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{		
		RaySumLast sum = new RaySumLast();
		int[] array1 = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.print(sum.go(array1) + "\n");
		int[] array2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.print(sum.go(array2) + "\n");
		int[] array3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.print(sum.go(array3) + "\n");
		int[] array4 = {32767};
		System.out.print(sum.go(array4) + "\n");
		int[] array5 = {255,255};
		System.out.print(sum.go(array5) + "\n");
		int[] array6 = {9,10,-88,100,-555,2};
		System.out.print(sum.go(array6) + "\n");
		int[] array7 = {10,10,10,11,456};
		System.out.print(sum.go(array7) + "\n");
		int[] array8 = {-111,1,2,3,9,11,20,1};
		System.out.print(sum.go(array8) + "\n");
		int[] array9 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.print(sum.go(array9) + "\n");
		int[] array10 = {12,15,18,21,23,1000};
		System.out.print(sum.go(array10) + "\n");
		int[] array11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.print(sum.go(array11) + "\n");
		int[] array12 = {9,10,-8,10000,-5000,-3000};
		System.out.print(sum.go(array12) + "\n");
		
	}
}