package elevenLab;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
	private String suit;
	private String rank;
	private int face;
	private int pointValue;
		//String suit
		//int face

  	//constructors
	public Card() {
		
	}
	public Card(String cardRank, String cardSuit, int pointValue) {
		rank = cardRank;
		suit = cardSuit;
		face = pointValue;
		this.pointValue  = pointValue;
	}
	public Card(String cardRank, String cardSuit, int cardFace, int cardPointValue) {
		suit = cardSuit;
		face = cardFace;
		rank = cardRank;
		pointValue = cardPointValue;
	}
	public Card(String cardSuit, int cardFace) {
		suit = cardSuit;
		face = cardFace;
	}

	// modifiers
		//set methods
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public void setFace(int face) {
		this.face = face;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}

	//accessors
		//get methods
	public int getFace(){
		return face;
	}
	public String getSuit() {
		return suit;
	}
	public String getRank() {
		return rank;
	}
	public int getPointValue() {
		return pointValue;
	}
	public boolean matches(Card otherCard) {
		if(this.getSuit().equals((otherCard.getSuit()))&&this.getRank().equals(otherCard.getRank())){
			return true;
		}else if(this.getSuit().equals((otherCard.getSuit()))&&this.getFace() == otherCard.getFace() ) {
			return true;
		}
		return false;
	}
	

  	//toString
	public String toString() {
		if(pointValue == 0) {
			return FACES[face] + " of " + suit;
		}else {
		return FACES[face] + " of " + suit + "(Point value = " + pointValue + ")";
		}
	}

 }