package FRQ_4;

import java.util.ArrayList;

public class OnlinePurchaseManager
{
   //purchases stores Gizmos
   private ArrayList<Gizmo> purchases;
   
   
   //point purchases at a new ArrayList   
   public OnlinePurchaseManager()
   {
   	purchases = new ArrayList<Gizmo>();
   }
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public void add( String m, boolean e )
   {
   	purchases.add( new Gizmo( m, e) );
   }
   
   
   //Part A
   //count the number of Gizmos made by maker
   //that are also electronic
   //must call getMaker and isElectronic
   //return the count or 0 if no matches
   public int countElectronicsByMaker(String maker)
   {   
	   int count = 0;
   	//WRITE CODE HERE FOR PART A
	   for(Gizmo giz: purchases) {
		   if(giz.getMaker().equalsIgnoreCase(maker)) {
			   if(giz.isElectronic()) {
			   count++;
			   }
		   }
	   }
   	return count;   	
   }
   

   //Part B
   //loop thought the list and check for matching adjacent pairs
   //return true of any adjacent [ side by side ] pairs are the same
   //to be the same the pairs must have the same maker and
   //be either electronic or non-electronic
   //you really really should use the equals method from Gizmo
   public boolean hasAdjacentEqualPair()
   {  
   	//WRITE CODE HERE FOR PART B
	   for(int i = 1; i < purchases.size(); i++) {
		   //System.out.print(purchases.get(i).toString() + ", ");
		   if(purchases.get(i).equals(purchases.get(i-1))) {
			   return true;
		   }
	   }
   	return false;   	
   }
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public String toString()
   {
   	return "" + purchases;
   }
}


/*Part C

OPEN-ENDED SECTION

A programmer would like to add a method getCheapestGizmoByMaker, 
which returns the least expensive Gizmo purchased by an individual 
from a given maker.

Write a description of how you would change the Gizmo and OnlinePurchaseManager 
classes in order to support this modification. 
 
Make sure to include the following in your response. 

�	Write the method header for the getCheapestGizmoByMaker method. 
	DO write code for this part.

�	Identify any new or modified variables, constants, constructors, 
   or methods aside from the getCheapestGizmoByMaker method. 
   DO NOT write code for this part.
   
�	Describe, for each new or revised variable, constant, constructor, 
   or method, how it would change or be implemented, including visibility and type. 
   You do not need to describe the getCheapestGizmoByMaker method.
   DO NOT write code for this part.
	The gizmo would need a variable to hold cost and the constructor needs to set this.
	Get methods would be needed for this variable getCost().
	The OnlinePurchaserManager would have a method getCheapestGizmoByMaker(String maker) which would take a string
	and would have an gizmo cheapest in it that would be starting undefined.
	the method would have a for loop loop through the purchased ArrayList and check if the maker matches the maker 
	that it was passed. If it did, it would check if that gizmo's getValue was lower than cheapest, the chepaest variable
	would be set to the new gizmo.
*/

