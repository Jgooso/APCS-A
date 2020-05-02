package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   Color color;
   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int speed) {
	   this.speed = speed;
   }
   
   public Paddle(int x, int y) {
	   xPos = x;
	   yPos = y;
   }
   public Paddle(int height, int width, int speed) {
	   this.width = width;
	   this.height = height;
	   this.speed = speed;
   }
   public Paddle(int x, int y, int width, int height, int speed) {
	   xPos = x;
	   yPos = y;
	   this.width = width;
	   this.height = height;
	   this.speed = speed;
   }
   public Paddle(int x, int y, int width, int height, Color color, int speed) {
	   xPos = x;
	   yPos = y;
	   this.width = width;
	   this.height = height;
	   this.color = color;
	   this.speed = speed;
   }









   public void moveUpAndDraw(Graphics window)
   {
	   yPos -= speed;
	   super.draw(window,color);
	   

   }

   public void moveDownAndDraw(Graphics window)
   {
	   yPos += speed;
	   super.draw(window,color);

   }

   //add get methods
   public int getSpeed() {
		return speed;
	}
   @Override
   public int getX() {
	   return xPos;
   }
   @Override
   public int getY() {
	   return yPos;
   }
   @Override
   public int getWidth() {
	   return width;
   }
   @Override
   public int getHeight() {
	   return height;
   }
   
   //add a toString() method
   @Override
   public String toString() {
	   return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color + ", " + speed;
   }
}