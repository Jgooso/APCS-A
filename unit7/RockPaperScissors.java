package unit7;

//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private int randomChoice;
	public String result;
	String[] rvp = {"<<Paper Covers Rock>>!","<<Rock Breaks Scissors>>!","Scissors cut Paper>>!"};
	
	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
	}

	public void setPlayers(String player)
	{
		randomChoice = (int)(Math.random()*3);
		playChoice = player;
		if(randomChoice == 0) {
			compChoice = "R";
		}else if(randomChoice == 1) {
			compChoice  = "S";
		}else {
			compChoice = "P";
		}
		out.println("player had " + playChoice);
		out.println("computer had " + compChoice);
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.compareTo(compChoice) == 0) {
			winner = "Draw";
			result = "";
			return winner;
			
		}
			
		if( playChoice.equalsIgnoreCase("R")){
			if(compChoice.equalsIgnoreCase("S")) {
				winner = "Player";
				result = rvp[1];
			}else{
				winner = "Computer";
				result = rvp[0];
			}
		}
		if( playChoice.equalsIgnoreCase("S")){
			if(compChoice.equalsIgnoreCase("P")) {
				winner = "Player";
				result = rvp[2];
			}else { 
				winner = "Computer";
			result = rvp[1];
			}
		}
		if( playChoice.equalsIgnoreCase("P")){
			if(compChoice.equalsIgnoreCase("R")) {
				winner = "Player";
			result = rvp[0];
			}else {
				winner = "Computer";
				result = rvp[2];
			}
		}
		
		return winner;
	}

	public String toString()
	{
		String output= "";
		return output;
	}
}