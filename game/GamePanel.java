package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class GamePanel extends JPanel implements ActionListener{
	
	ArrayList<Button> buttonArray;
	public JTextField player1;
	public JTextField player2;
	Button topButton;
	Button bottomButton;
	JLabel label;
	GameManager manager;
	String gameState;
	JLabel highScore;
	JLabel title;
	JTextArea instructions;
	JLabel author;
	JButton continueButton;
	public GamePanel() {
		buttonArray = new ArrayList<Button>();
		player1 = new JTextField();
		player2 = new JTextField();
		
		introScreen();
		label = new JLabel();
		manager = new GameManager(buttonArray);
		gameState = "INTRO";
		setLayout(null);
		//addMenuButton();
		
		player1.setText("Player 1\n     " + manager.getPlayerOneScore() );
		player2.setText("Player 2\n     " + manager.getPlayerTwoScore() );
		
		
		
	}
	void update() {
		
		if(manager.getPlayerTurn() == 1) {
			player2.setForeground(Color.black);
			player1.setForeground(Color.red);
		}else {
			player2.setForeground(Color.red);
			player1.setForeground(Color.black);
		}
		player1.setText("Player 1\n     " + manager.getPlayerOneScore() );
		player2.setText("Player 2\n     " + manager.getPlayerTwoScore() );
		if(manager.gameVersion == 1) {
		if(manager.gameEnd(buttonArray)) {
			if(manager.getPlayerOneScore() > manager.getPlayerTwoScore()) {
				label.setText("Player One Wins");
			}else if(manager.getPlayerOneScore() < manager.getPlayerTwoScore()) {
				label.setText("Player Two Wins");
			}else if(manager.getPlayerOneScore() == manager.getPlayerTwoScore()) {
				label.setText("DRAW");
			}
		}
		}else {
			if(manager.gameEnd(buttonArray)) {
			if(manager.getPlayerOneScore() > manager.getPlayerTwoScore()) {
				remove(player1);
				remove(player2);
				remove(label);
				buttonArray.clear();
				addGameButton();
			}else if(manager.getPlayerOneScore() < manager.getPlayerTwoScore()) {
				label.setText("Player Two Wins");
			}else if(manager.getPlayerOneScore() == manager.getPlayerTwoScore()) {
				label.setText("DRAW");
			}
			}
		}
		repaint();
		
	}
	void introScreen() {
		
		title = new JLabel();
		instructions = new JTextArea();
		author = new JLabel();
		continueButton = new Button(90);
		instructions.setEditable(false);
		add(title);
		add(instructions);
		add(author);
		add(continueButton);
		gameState = "INTRO";
		title.setText("Catch Up");
		instructions.setText("Click on buttons. \nYou gain points equal \nto number on button. \nIf you have more or equal points\nto opponent your turn end.\nPress Enter to Continue");
		author.setText("Josh Goodman");
		title.setBounds(120,10,275,80);
		title.setFont(new Font("SansSerif", Font.BOLD, 30));
		instructions.setBounds(0,100,375,200);
		author.setFont(new Font("SansSerif", Font.BOLD, 30));
		author.setBounds(10, 300, 300, 100);
		continueButton.setBounds(150,450 , 75, 75);
		continueButton.setText("continue");
		continueButton.addActionListener(this);
		
	}
	void addMenuButton() {
		topButton = new Button(0);
		bottomButton = new Button(14);
		highScore = new JLabel();
		add(topButton);
		add(bottomButton);
		add(highScore);
		topButton.addActionListener(this);
		bottomButton.addActionListener(this);
		topButton.setBounds(90, 155, 200, 85);
		bottomButton.setBounds(90, 380, 200, 85);
		highScore.setBounds(140,220,100,85);
		highScore.setVisible(false);
		try {
			highScore.setText("High Score: " + new Scanner(new File("src/game/endlessHighScore.txt")).nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		topButton.setText("One player");
		bottomButton.setText("Two Player");
		if(gameState == "GAME") {
			for(int i = 0; i < buttonArray.size();i++) {
				remove(buttonArray.get(i));
			}
			buttonArray.clear();
			remove(player1);
			remove(player2);
			remove(label);
		}
		gameState = "MENU";
	}
	void addGameButton() {
		int count = 0;
		gameState = "GAME";
		add(player1);
		add(player2);
		add(label);
		remove(topButton);
		remove(bottomButton);
		remove(highScore);
		for(int i = 1; i <13;i++) {
			buttonArray.add(new Button(i));
		}
		for(int i = 0; i < buttonArray.size();i++) {
			add(buttonArray.get(i));
			buttonArray.get(i).addActionListener(this);
		}
		for(int i = 0; i < 4;i++) {
			for(int x = 0; x < 3;x++) {
				buttonArray.get(count).setBounds(10+(120*x), 100+(135*i), 120, 120);
				count++;
			}
		}
		player1.setBounds(10, 10, 120, 50);
		player2.setBounds(250,10,120,50);
		label.setBounds(130, 10, 120, 50);
	}
	public void removeButton() {
		//printArray();
		for(int i = 0; i < buttonArray.size();i++) {
			if(buttonArray.get(i).getIsActive()==false){
				//System.out.print(buttonArray.get(i).getIsActive());
				buttonArray.get(i).setVisible(false);
				
			}
		}
		manager.setArray(buttonArray);
		
	}
	public void printArray() {
		for(int i = 0; i < buttonArray.size();i++) {
			System.out.print(buttonArray.get(i).getPointValue() +" " +  buttonArray.get(i).getIsActive()+", ");
		}
		System.out.println();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button ButtonPressed;
		ButtonPressed = (Button)e.getSource();
		if(gameState == "MENU") {
			if(ButtonPressed.getPointValue()==0) {
				topButton.setText("Endless");
				bottomButton.setText("Normal");
				topButton.setPointValue(15);
				bottomButton.setPointValue(16);
				highScore.setVisible(true);
			}else if(ButtonPressed.getPointValue() == 14) {
				addGameButton();
			}else if(ButtonPressed.getPointValue() == 15) {
				manager = new EndlessGame(buttonArray);
				manager.setGameVersion(2);
				addGameButton();
			}else if(ButtonPressed.getPointValue() == 16) {
				manager = new OnePlayer(buttonArray);
				addGameButton();
			}
			//System.out.println(manager.gameVersion);
		}else if(gameState == "GAME") {
			for(int i = 0; i < buttonArray.size();i++) {
				if(ButtonPressed.getPointValue() == buttonArray.get(i).getPointValue()){
					buttonArray.get(i).setIsActive(false);
				}
			}
		manager.buttonPress(ButtonPressed);
		buttonArray = manager.getButtonArray();
		removeButton();
		update();
		
		}else if(gameState == "INTRO") {
			author.setVisible(false);
			title.setVisible(false);
			instructions.setVisible(false);
			continueButton.setVisible(false);
			remove(author);
			remove(instructions);
			remove(title);
			remove(continueButton);
			
			addMenuButton();
		}
	}
	
}
