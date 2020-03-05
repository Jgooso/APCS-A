package elevenLab;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	private int size;

   //make a Deck constructor
	Deck(){
		top = NUMCARDS;
		cards = new ArrayList<Card>();
		for(int s = 0; s < SUITS.length; s ++) {
			for(int f = 1; f <= 13; f++) {
				cards.add(new Card(SUITS[s], f));
			}
		}
		size = cards.size();
		top = size-1;
	}
	Deck(String[] ranks, String[] suits, int[] pointValues){
		top = NUMCARDS;
		cards = new ArrayList<Card>();
		for(int s = 0; s < suits.length; s ++) {
			for(int r = 0; r < ranks.length; r++) {
				cards.add(new Card(ranks[r], suits[s],pointValues[r]));
			}
		}
		size = cards.size();
		top = size-1;
	}
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
	
	public Card dealCard() {//make a dealCard() method that returns the top card
		Card topCard;
		if(!isEmpty()) {
			topCard = cards.get(top);
		
		}else {
			//resetTop();
			return new Card();
			
		}
		
		top--;
		size--;
		return topCard;
		
	}
	public boolean isEmpty() {
		return size() == 0;
	}
	public int size() {
		return size;
	}
   
   
	//write a shuffle() method
   	//use Colletions.shuffle
   void shuffle() {
	   Collections.shuffle(cards);
	   resetTop();
   }
   
   	//reset the top card 
   public void resetTop() {
	   size = cards.size();
	   top = size-1;
   }
   public String toString() {
	   String rtn = size + ", " + isEmpty() + ",";
	   return rtn;
   }
}