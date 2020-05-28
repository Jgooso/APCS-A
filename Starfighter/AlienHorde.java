package Starfighter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < 2;i++) {
			for(int x = 0; x < 10; x++) {
				add(new Alien(35 + x*75,10+50*i,50,50,1));
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i< aliens.size();i++) {
			aliens.get(i).draw(window);
		}
		moveEmAll();
	}

	public void moveEmAll() 
	{
		int direction = 0;
		for(int i = 0; i< aliens.size();i++) {
			aliens.get(i).move("DOWN");
			
			
			
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		
		for(int i = 0; i < aliens.size();i++) {
			for(int x = 0; x < shots.size();x++) {
				if(aliens.get(i).collisionBox.intersects(shots.get(x).collisionBox)) {
					aliens.remove(i);
					shots.remove(x);
					
				}
			}
			
		}
	}

	public String toString()
	{
		return "";
	}
}
