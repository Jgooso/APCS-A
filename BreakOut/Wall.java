package BreakOut;

import java.awt.Color;
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
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
		//System.out.println(x + ", " + y + ", " + width + ", " + height);
	}
}
