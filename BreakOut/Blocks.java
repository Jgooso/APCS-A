package BreakOut;

import java.awt.Graphics;

public class Blocks extends Block{

	public boolean active = true;
	public int x;
	public int y;
	public int width;
	public int height;
	public Ball ball;
	public Blocks( int x, int y, int width, int height) {
		
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		ball = new Ball();
	}

	
	public void draw(Graphics g) {
		active = ball.didBlocksCollision(this);
		System.out.println(active);
		if(active == true) {
			//g.fillRect(x, y, width, height);
			
		}
	}
}
