package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   if(a.substring(0,1).equalsIgnoreCase("a") || a.substring(a.length()-1,a.length()).equalsIgnoreCase("a") ||
		  a.substring(0,1).equalsIgnoreCase("e") || a.substring(a.length()-1,a.length()).equalsIgnoreCase("e") ||
		  a.substring(0,1).equalsIgnoreCase("i") || a.substring(a.length()-1,a.length()).equalsIgnoreCase("i") ||
		  a.substring(0,1).equalsIgnoreCase("o") || a.substring(a.length()-1,a.length()).equalsIgnoreCase("o") ||
		  a.substring(0,1).equalsIgnoreCase("u") || a.substring(a.length()-1,a.length()).equalsIgnoreCase("u") ){
		return "yes";
	   } else {
		   return "no";
	   }
	}
}