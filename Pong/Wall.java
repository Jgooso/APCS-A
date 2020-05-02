package Pong;

import java.awt.Graphics;

public class Wall extends Block {
	int x;
	int y; 
	int height;
	int width;
	public Wall(int xPos,int yPos,int width,int height) {
		x = xPos;
		y = yPos;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}
