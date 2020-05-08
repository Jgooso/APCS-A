package WinterScene;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
public class FancySnowFlake extends AbstractShape{
	int[] xPoints;
	int[] yPoints;
	int xPos;
	int yPos;
	int height;

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		xPos = x;
		yPos = y;
		height = ht;
		// TODO Auto-generated constructor stub
		int[] xpoints = {xPos,xPos+(wid/2),xPos,xPos-(wid/2)};
		int[] ypoints = {yPos,yPos+height,yPos+(height*2),yPos + height};
		xPoints = xpoints;
		yPoints = ypoints;
		super.setYSpeed(5);
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.drawPolygon(xPoints,yPoints,4);
		
		
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		yPos += super.getYSpeed();
		draw(window);
		for(int i = 0; i < yPoints.length;i++) {
			yPoints[i] += 5;
		}
		if(yPoints[2] > 600) {
			yPoints[0] = 0;
			yPoints[1] =  height;
			yPoints[2] = height*2;
			yPoints[3] = height;
			
		}
		
		
	}
	@Override
	public int getYPos() {
		return this.yPos;
	}
	@Override
	public void setYPos(int y) {
		this.yPos = y;
	}
	@Override 
	public int getHeight(){
		return height*2;
	}
	
}
//extend the AbstractShape class to make a FancySnowFlake class


