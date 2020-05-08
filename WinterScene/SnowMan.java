package WinterScene;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
		this.xPos = x;
		this.yPos = y;
		this.width = w;
		this.height = h;
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 
	   
	  window.fillOval(xPos, yPos, width, height);
	  window.fillOval(xPos-25, yPos + 30, width*2, height*2);
	  window.fillOval(xPos-50, yPos+90, width*3, height*3);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}