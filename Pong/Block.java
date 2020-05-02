package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}
	public Block(int x, int y, int width, int height, Color color) {
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public Block(int x, int y) {
		xPos = x;
		yPos = y;
	}
	//add other Block constructors - x , y , width, height, color
	
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
   public void setColor(Color col)
   {
	   color = col;

   }

   public Color getColor() {
	return color;
}

public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(Color.black);
      //System.out.println(getX() + ", " + getY() + ", " + getWidth() + ", " + getHeight());
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   

   }
   
	public boolean equals(Object obj)
	{
		if(this.toString().equals(obj.toString())) {
			return true;
		}



		return false;
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}
	
	 

   //add the other get methods
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}  

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color;
	}
}