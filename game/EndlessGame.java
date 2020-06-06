package game;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EndlessGame extends GameManager{
	GameAI computer;
	int highScore;
	File file;
	
	FileWriter writer;
	Scanner input;
	BufferedWriter bw;
	public EndlessGame(ArrayList<Button> buttonArray) {
		super(buttonArray);
		computer = new GameAI(buttonArray);
		gameVersion = 2;
		file = new File("src/game/endlessHighScore.txt");
		try {
			input = new Scanner(file);
			highScore = Integer.parseInt(input.nextLine());
			writer = new FileWriter(file);
			bw = new BufferedWriter(writer);
			
			
		}catch(Exception e) {
		System.out.print(e);
		}
	}

	@Override
	public void changeTurn() {
		// TODO Auto-generated method stub
		computerCall();
		playerTurn = 1;
	}
	public void computerCall() {
		computer.gameAI(playerOneScore, playerTwoScore,playerTurn,buttonArray);
		super.setPlayerTwoScore(computer.getPlayerTwoScore());
		//printArray();
		
	}
	
	@Override
	public boolean gameEnd(ArrayList<Button> list) {
		// TODO Auto-generated method stub
		if(super.gameEnd(list)==true&& playerTwoScore >= playerOneScore) {
			try {
				bw.write(String.valueOf(highScore));
				System.out.println(String.valueOf(highScore));
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return super.gameEnd(list);
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
		if(playerOneScore > highScore) {
			highScore = playerOneScore;
			
			
			
		}
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
