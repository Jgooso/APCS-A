package unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd = -1;
		int even = 0;
		for(int i = 0; i < ray.length; i ++) {
			if(odd < 0 && ray[i] % 2 == 1) {
				odd = i;
				//return i;
			}
			if( odd > -1 && ray[i] % 2 == 0 && even == 0) {
				even = i;
				//return i;
			}
		}
		if(even == 0) {
		return -1;
		}else {
			return even-odd;
		}
	}
}