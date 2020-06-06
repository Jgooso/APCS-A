package game;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class OnePlayer extends GameManager{
	GameAI computer;
	public OnePlayer(ArrayList<Button> buttonArray) {
		super(buttonArray);
		computer = new GameAI(buttonArray);
		
		//System.out.println("one Payer");
	}

	@Override
	public void changeTurn() {
		// TODO Auto-generated method stub
		
		computerCall();
		playerTurn = 1;
		//System.out.println(toString());
		
	}
	public void computerCall() {
		computer.gameAI(playerOneScore, playerTwoScore,playerTurn,buttonArray);
		
		super.setPlayerTwoScore(computer.getPlayerTwoScore());
		//printArray();
		
	}
	public void printArray() {
		for(int i = 0; i < buttonArray.size();i++) {
			System.out.print(buttonArray.get(i).getPointValue() +" " +  buttonArray.get(i).getIsActive()+", ");
		}
		System.out.println();
	}
	public String toString() {
		return playerOneScore + ", " + playerTwoScore;
	}
	@Override
	public void setArray(ArrayList<Button> list) {
		// TODO Auto-generated method stub
		super.setArray(list);
	}

	@Override
	public ArrayList<Button> getButtonArray() {
		// TODO Auto-generated method stub
		return super.getButtonArray();
	}

	@Override
	public void buttonPress(Button button) {
		// TODO Auto-generated method stub
		super.buttonPress(button);
		//System.out.println(computer.getPlayerTwoScore());
	}

	@Override
	public boolean gameEnd(ArrayList<Button> list) {
		// TODO Auto-generated method stub
		return super.gameEnd(list);
	}

	@Override
	public int getPlayerOneScore() {
		// TODO Auto-generated method stub
		return super.getPlayerOneScore();
	}

	@Override
	public void setPlayerOneScore(int playerOneScore) {
		// TODO Auto-generated method stub
		super.setPlayerOneScore(playerOneScore);
	}

	@Override
	public int getPlayerTwoScore() {
		// TODO Auto-generated method stub
		return super.getPlayerTwoScore();
	}

	@Override
	public void setPlayerTwoScore(int playerTwoScore) {
		// TODO Auto-generated method stub
		super.setPlayerTwoScore(playerTwoScore);
	}

	@Override
	public int getPlayerTurn() {
		// TODO Auto-generated method stub
		return super.getPlayerTurn();
	}

	@Override
	public void setPlayerTurn(int playerTurn) {
		// TODO Auto-generated method stub
		super.setPlayerTurn(playerTurn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
	}

}
