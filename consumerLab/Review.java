package consumerLab;

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("src/consumerLab/cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/consumerLab/positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/consumerLab/negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

/** Activity 2: totalSentiment()
  * Write the code to total up the sentimentVals of each word in a review.
 */
  public static double totalSentiment(String filename)
  {
    // read in the file contents into a string using the textToString method with the filename
	  String words = textToString(filename);
    // set up a sentimentTotal variable
	  double sentimentTotal = 0.0;
    // loop through the file contents 
	  //String[] word = words.split(" ");
	  //System.out.println(words.indexOf(' '));
	  try {
			
			while(words.contains(" ")) {
				sentimentVal(words.substring(0,words.indexOf(' ')));
				if(words.length()>1)
					words = words.substring(words.indexOf(' ')+1, words.length()-1);
				//System.out.println(words.substring(0,words.indexOf(' ')));
				
			}
			
			
			}
			catch(Exception e){
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
			}
	  
       // find each word
       // add in its sentimentVal
       // set the file contents to start after this word
	 //System.out.print(words);
   



   return sentimentTotal; 
  }


  /** Activity 2 starRating method
     Write the starRating method here which returns the number of stars for the review based on its totalSentiment.
  */
  public static int starRating(String filename)
  {
    // call the totalSentiment method with the fileName
	  double score = totalSentiment(filename);
    // determine number of stars between 0 and 4 based on totalSentiment value 
    int stars = 0;
    // write if statements here
    if(score >= 2) {
    	stars = 5;
    }else if( score >= 1) {
    	stars = 4;
    }else if(score >= 0) {
    	stars = 3;
    }else if(score >= -1) {
    	stars = 2;
    }else {
    	stars = 1;
    }

  
    // return number of stars
    return stars; 
  }
  public static String fakeReview(String fileName) {
	  String words = textToString(fileName);
	  //String word = "nil";
	  String[] word = words.split(" ");
	  boolean op = false;// true = positive, false = negative
	  //System.out.print(words.indexOf(' '));
	  try {
			
			for(String ss : word) {
				if(ss.charAt(0) == '*') {
					if(op == true) {
						if(sentimentVal(ss)<=0) {
							ss=randomPositiveAdj();
						}
					}else {
						if(sentimentVal(ss)>=0) {
							ss = randomNegativeAdj();
						}
					}
					
				}
			
				System.out.print(ss + " ");
			}
			
			
			}
			catch(Exception e){
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
			}
	  return "";
  }
}