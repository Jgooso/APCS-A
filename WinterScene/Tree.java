package WinterScene;

import java.awt.Color;
import java.awt.Graphics;

public class Tree extends AbstractShape{
	private int x;
	private int y;
	private int width;
	private int height;

	public Tree(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		this.x = x;
		this.y = y;
		width = wid;
		height = ht;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.BLACK);
		window.fillRect(x, y, width, height);
		window.setColor(Color.GREEN);
		window.fillOval(x-(3*width/2)+10, y-height/3, width*2, width*2);
		window.fillOval((x+width/2)-10, y-height/3, width*2, width*2);
		window.fillOval(x-width/2, y-(2*height/3)+10, width*2, width*2);
		window.setColor(Color.WHITE);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		
	}
	
}
