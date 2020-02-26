package unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		RayOddToEven ray = new RayOddToEven();
		int[] array1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.print(ray.go(array1) + "\n");
		int[] array2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.print(ray.go(array2) + "\n");
		int[] array3 = {10,20,30,40,5,41,31,20,11,7};
		System.out.print(ray.go(array3) + "\n");
		int[] array4 = {32767,70,4,5,6,7};
		System.out.print(ray.go(array4) + "\n");
		int[] array5 = {2,7,11,21,5,7};
		System.out.print(ray.go(array5) + "\n");
		int[] array6 = {7,255,11,255,100,3,2};
		System.out.print(ray.go(array6) + "\n");
		int[] array7 = {9,11,11,11,7,1000,3};
		System.out.print(ray.go(array7) + "\n");
		int[] array8 = {7,7,7,11,2,7,7,11,11,2};
		System.out.print(ray.go(array8) + "\n");
		int[] array9 = {2,4,6,8,8};
		System.out.print(ray.go(array9) + "\n");
		
	}
}