package BreakOut;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	
	private boolean[] keys;
	private BufferedImage back;
	int rightScore;
	int leftScore;
	Wall leftWall;
	Wall rightWall;
	Wall topWall;
	Wall bottomWall;
	Blocks block1;

	public Pong()
	{
		//set up all variables related to the game
		int width = super.getWidth();
		int height = super.getHeight();
		int xPos = super.getX();
		int yPos = super.getY();
		rightScore = 0;
		leftScore = 0;
		leftWall = new Wall(0,0,1,600);
		rightWall = new Wall(799,0,1,600);
		topWall = new Wall(0,0,800,1);
		bottomWall = new Wall(0,599, 800,1);
		ball = new Ball();
		paddle = new Paddle(300,550,100,20,Color.black,10);
		block1 = new Blocks(400, 200, 200, 100);
		


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
	   
   }

   public void paint(Graphics window)
   {
	   
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.white);
		graphToBack.fillRect(0, 0, 800, 600);
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		block1.draw(graphToBack);
		graphToBack.drawString(String.valueOf(leftScore), 100, 20);
		graphToBack.drawString(String.valueOf(rightScore), 700, 20);

		//see if ball hits left wall or right wall
		if(ball.didCollideLeft(leftWall)) {
			ball.setXSpeed(ball.getXSpeed() * -1);
			
		}
		if(ball.didCollideRight(rightWall)) {
			ball.setXSpeed(ball.getXSpeed() * -1);
			
		}

		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideTop(topWall)) {
			
			ball.setYSpeed(ball.getYSpeed() * -1);
		}
		if(ball.didCollideBottom(bottomWall)) {
			//ball.setXSpeed(0);
			//ball.setYSpeed(0);
		}


		//see if the ball hits the left paddle
		
		
		
		if(ball.getY()+ball.getHeight() >= paddle.getY()) {
			if(ball.getX() > paddle.getX() && ball.getX()+ball.getWidth() < paddle.getX() + paddle.getWidth()) {
				ball.setXSpeed(ball.getXSpeed() * -1);
				ball.setYSpeed(ball.getYSpeed() * -1);
			}
		}
		
		
		//see if the ball hits the right paddle
		
		
		


		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			paddle.moveLeftAndDraw(window);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			paddle.moveRightAndDraw(window);

		}
		

		












		
		twoDGraph.drawImage(back, null, 0, 0);
	}
   
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'C' : keys[0]=true; break;
			case 'B' : keys[1]=true; break;
			
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'C' : keys[0]=false; break;
			case 'B' : keys[1]=false; break;
			
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}