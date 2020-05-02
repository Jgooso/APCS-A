package Pong;

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
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	int rightScore;
	int leftScore;

	public Pong()
	{
		//set up all variables related to the game
		int width = super.getWidth();
		int height = super.getHeight();
		int xPos = super.getX();
		int yPos = super.getY();
		rightScore = 0;
		leftScore = 0;
		Wall leftWall = new Wall(0,0,1,super.getHeight());
		Wall rightWall = new Wall(super.getWidth()-1,0,1,super.getHeight());
		Wall topWall = new Wall(0,0,super.getWidth(),1);
		Wall bottomWall = new Wall(0,super.getHeight()-1, super.getWidth(),1);
		ball = new Ball();
		leftPaddle = new Paddle(50,400,20,100,Color.black,10);
		rightPaddle = new Paddle(750,400,20,100,Color.black,10);


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
	   Score();
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
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.drawString(String.valueOf(leftScore), 100, 20);
		graphToBack.drawString(String.valueOf(rightScore), 700, 20);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=570))
		{
			ball.setYSpeed(ball.getYSpeed()*-1);
		}



		//see if the ball hits the left paddle
		if(ball.didCollideLeft(leftPaddle)) {
			if(getX()+getWidth() <= leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(ball.getXSpeed() *-1);
			}else {
				ball.setXSpeed(ball.getXSpeed() *-1);
			}
		}
		
		
		//see if the ball hits the right paddle
		if(ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(ball.getXSpeed() *-1);
		}
		
		


		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(window);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}

		












		
		twoDGraph.drawImage(back, null, 0, 0);
	}
   public void Score() {
	   if(ball.getX()<leftPaddle.getX()) {
		   rightScore += 1;
		   ball.setX(400);
		   ball.setY(300);
		   ball.setXSpeed(Math.abs(ball.getXSpeed()) * -1);
	   }
	   if(ball.getX() > rightPaddle.getX() + rightPaddle.getWidth()) {
		   leftScore += 1;
		   ball.setX(400);
		   ball.setY(300);
		   ball.setXSpeed(Math.abs(ball.getXSpeed()));
	   }
   }
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
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