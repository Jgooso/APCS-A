package BreakOut;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	Wall wall;
	Paddle paddle;
	
	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
		xPos = super.getX();
		yPos = super.getY();
		
		
	}

	//add the other Ball constructors
	public Ball(int xSpeed, int ySpeed) {
	this.xSpeed = xSpeed;
	this.ySpeed = ySpeed;
	xPos = super.getX();
	yPos = super.getY();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods

	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	

	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   window.setColor(Color.blue);
	   window.fillOval(getX(), getY(), 20, 20);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      window.fillOval(getX(), getY(), 20, 20);
   }
   
	




	public boolean equals(Object obj)
	{




		return false;
	}

	  

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	} 
	@Override
	public int getX() {
		return xPos;
	}
	@Override
	public void setX(int x) {
		xPos = x;
	}
	@Override
	public void setY(int y) {
		yPos = y;
	}
	@Override
	public int getY() {
		return yPos;
	}
   //add a toString() method

	@Override
	public boolean didCollideLeft(Object obj) {
		wall = (Wall)obj;
		if(getX() <= wall.getX()) {
			return true;
		}
		return false;
	}
		
	
	@Override
	public boolean didCollideRight(Object obj) {
		wall = (Wall)obj;
		if(getX() >= wall.getX()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		wall = (Wall)obj;
		if(getY() <= wall.getY()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		wall = (Wall)obj;
		
		if(getY()+getHeight() >= wall.getY()) {
			return true;
		}
		
		
		return false;
	}
	public boolean didBlocksCollision(Blocks block) {
		if(getX() > block.x && getX() + getWidth() < block.x+width && getY() > block.y && getY()+getHeight() < block.y+height) {
			System.out.print("true");
			return false;
			
			
		}
		return true;
	}
}