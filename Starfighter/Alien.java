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

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean isActive;
	public Alien()
	{
		this(0,0,30,30,0);
		isActive = true;
	}

	public Alien(int x, int y)
	{
		//add code here
		super(x,y);
		isActive = true;
	}

	public Alien(int x, int y, int s)
	{
		//add code here
		super(x,y);
		speed = s;
		isActive = true;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/Starfighter/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
		isActive = true;
	}

	public void setSpeed(int s)
	{
	   //add code
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
		if(isActive = true) {
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
   	collisionBox = new Rectangle(super.getX(),super.getY(),super.getWidth(),super.getHeight());
		}
	}

	public String toString()
	{
		return "";
	}
}
