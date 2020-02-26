package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive tri = new TriangleFive();
	   tri.setAmount(4);
	   tri.setLetter('C');
	   tri.makeTriangle();
	   System.out.println();
	   
	   tri.setAmount(5);
	   tri.setLetter('A');
	   tri.makeTriangle();
	   System.out.println();
	   
	   tri.setAmount(7);
	   tri.setLetter('B');
	   tri.makeTriangle();
	   System.out.println();
	   
	   tri.setAmount(6);
	   tri.setLetter('X');
	   tri.makeTriangle();
	   System.out.println();
	   
	   tri.setAmount(8);
	   tri.setLetter('Z');
	   tri.makeTriangle();
	   
	}
}