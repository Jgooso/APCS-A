package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		RockPaperScissors game = new RockPaperScissors();		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			
			out.print("Rock-Paper-Scissors - pick you weapon [R,P,S] :: ");
			player = keyboard.nextLine();
			//read in the player value
			game.setPlayers(player);
			out.print(game.determineWinner() + " wins" + game.result);
			
	}
}



