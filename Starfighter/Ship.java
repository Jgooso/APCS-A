package Starfighter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(350,500,50,50,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		super(x, y);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		super(x,y);
		speed = s;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/Starfighter/ship.jpg");
			image = ImageIO.read(url);
			
		}
		catch(Exception e)
		{
			//feel free to do something here
			
		}
		
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		
		//add code here
		if(direction.equals("LEFT")) {
			super.setX(super.getX()-speed);
		}else if(direction.equals("RIGHT")){
			super.setX(super.getX()+speed);
		}else if(direction.equals("UP")) {
			super.setY(super.getY()-speed);
		}else if(direction.equals("DOWN")){
			super.setY(super.getY()+speed);
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
   	collisionBox = new Rectangle(getX(),getY(),getWidth(),getHeight());
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
