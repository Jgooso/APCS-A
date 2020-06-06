package game;



import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CatchUp {
	
	JFrame frame;
	GamePanel panel;
	public static final int WIDTH = 375;
	public static final int HEIGHT = 650;
	public static void main(String[] args) {
		CatchUp league = new CatchUp(new JFrame());
		
	}
	public CatchUp(JFrame frame) {
		this.frame = frame;
		panel = new GamePanel();
		setup();
	}
	void setup() {
		frame.setSize(WIDTH, HEIGHT);
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
