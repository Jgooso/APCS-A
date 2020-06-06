package game;

import java.util.ArrayList;
import java.util.Random;

public class GameAI {
	OnePlayer manager;
	ArrayList<Button> buttonArray;
	int playerOneScore;
	int playerTwoScore;
	boolean smartContinue;
	boolean activeList;
	int buttonAI;
	int aiRandom;
	int playerTurn;
	boolean buttonPressed;
	Random ran = new Random();
	public GameAI(ArrayList<Button> list) {
		buttonArray = list;
		
	}
	public void gameAI(int pOneScore, int pTwoScore,int playerTurn,ArrayList<Button> list) {
		playerOneScore = pOneScore;
		playerTwoScore = pTwoScore;
		buttonArray = list;
		//System.out.println(toString());
		if(playerOneScore >= playerTwoScore && listActive()) {
		manager = new OnePlayer(buttonArray);
			if(smartAICode()) {
				
				buttonAI = 11;
				for(int i = 0; i < buttonArray.size();i++) {
					if(buttonArray.get(buttonAI).getPointValue()+playerTwoScore < playerOneScore) {
						if(buttonArray.get(buttonAI).getIsActive()==true) {
							buttonPress(buttonAI);
							break;
						}
					}
					buttonAI -= 1;
				}
				
				if(smartAICode()) {
					if(playerOneScore >= playerTwoScore) {
						aiRandom = ran.nextInt(2);
						//System.out.println(aiRandom);
						if(aiRandom == 0) {
							buttonAI = 11;
							for(int i = 0; i < buttonArray.size();i++) {
								if(buttonArray.get(buttonAI).getIsActive()==true) {
									buttonPress(buttonAI);
									break;
								}
								buttonAI -=1;
							}
						}else if(aiRandom == 1) {
							if(listActive() == true) {
								while(playerTwoScore <= playerOneScore) {
									buttonAI = ran.nextInt(12);
									if(buttonArray.get(buttonAI).getIsActive() == true) {
										buttonPress(buttonAI);
										break;
									}else {
										continue;
									}
								}
							}
						}
					}
				}
			}
		//printArray();
		//System.out.println(toString());
		manager.setPlayerTwoScore(playerTwoScore);
		manager.setArray(buttonArray);
		manager.setPlayerTurn(playerTurn);
		}
	}
	public void printArray() {
		for(int i = 0; i < buttonArray.size();i++) {
			System.out.print(buttonArray.get(i).getPointValue() +" " +  buttonArray.get(i).getIsActive()+", ");
		}
		System.out.println();
	}
	public int getPlayerTwoScore() {
		return playerTwoScore;
	}
	public boolean listActive() {
		activeList = false;
		for(int i = 0; i < buttonArray.size();i++) {
			if(buttonArray.get(i).getIsActive() == true) {
				activeList = true;
			}
		}
		//System.out.print(activeList);
		return activeList;
		
	}
	public void buttonPress(int buttonIndex) {
			playerTwoScore += buttonArray.get(buttonIndex).getPointValue();
			//System.out.println(playerTwoScore);
			System.out.println(buttonArray.get(buttonIndex).getPointValue());
			buttonArray.get(buttonIndex).setIsActive(false);
			
	}
	public boolean smartAICode() {
		//System.out.print(smartContinue);
		smartContinue = true;
		while(buttonAI < 11) {
			buttonAI+=1;
			if(playerOneScore + buttonAI>= 39 && buttonArray.get(buttonAI).isActive == true) {
				buttonPress(buttonAI);
				if(playerOneScore <= playerTwoScore) {
					smartContinue = false;
				}
				break;
			}else if(playerTwoScore + buttonAI >= 39) {
				if(buttonArray.get(buttonAI).isActive == true) {
					buttonPress(buttonAI);
					if(playerOneScore <= playerTwoScore) {
						smartContinue = false;
					}
					break;
				}
			}
		}
		return smartContinue;
		
	}
	public String toString() {
		return playerOneScore + ", " + playerTwoScore + ", ";
	}
	
}
	
