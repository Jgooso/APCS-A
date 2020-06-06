package game;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


import javax.swing.*;
public class GameManager implements ActionListener{
	
	int playerOneScore;
	int playerTwoScore;
	int playerTurn;
	int gameVersion;
	int highScore;
	ArrayList<Button> buttonArray;
	
	public GameManager(ArrayList<Button> buttonArray) {
		playerTurn = 1;
		gameVersion = 1;
		this.buttonArray=buttonArray;
		
		
	}
	
	public void changeTurn() {
		if(playerTurn == 1 && playerOneScore >= playerTwoScore) {
			playerTurn = 2;
		} else if(playerTurn == 2 && playerTwoScore >= playerOneScore) {
			playerTurn = 1;
		}
	}
	public boolean gameEnd(ArrayList<Button> list){
		boolean gameEnd = true;
		for(Button b: list) {
			if(b.getIsActive() == true) {
				gameEnd = false;
			}
		}
		
		return gameEnd;
		
		
	}
	public int getGameVersion() {
		return gameVersion;
	}
	public void setGameVersion(int gVersion) {
		gameVersion = gVersion;
	}
	public void setArray(ArrayList<Button> list) {
		buttonArray = list;
	}
	public int getPlayerOneScore() {
		return playerOneScore;
	}
	public void setPlayerOneScore(int playerOneScore) {
		this.playerOneScore = playerOneScore;
	}
	public int getPlayerTwoScore() {
		return playerTwoScore;
	}
	public void setPlayerTwoScore(int playerTwoScore) {
		this.playerTwoScore = playerTwoScore;
	}
	public int getPlayerTurn() {
		return playerTurn;
	}
	public void setPlayerTurn(int playerTurn) {
		this.playerTurn = playerTurn;
	}
	public ArrayList<Button> getButtonArray() {
		return buttonArray;
	}
	public void buttonPress(Button button) {
		
		if(playerTurn == 1) {
			playerOneScore += button.getPointValue();
			
		}else {
			playerTwoScore += button.getPointValue();
		}
		
		changeTurn();
		
		
		
		//System.out.println(playerOneScore + ", " + playerTwoScore);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		;
		
		
		
	}
}
