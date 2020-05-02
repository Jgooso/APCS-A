package unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		
		
	}

	public void sort()
	{
		
		String sort = "";
		for(int x = 0;x < wordRay.length-1;x++) {
			
			for(int i = 0; i< wordRay[x].length();i++) {
				if(wordRay[x].charAt(i) > wordRay[x+1].charAt(i)){
					sort = wordRay[x+1];
					wordRay[x+1] = wordRay[x];
					wordRay[x] = sort;
					if(x >= 1) {
						x -= 2;
						}else {
						x--;
						}
					break;
					
				}else if(wordRay[x].charAt(i) == wordRay[x+1].charAt(i)){
					continue;
				}
				break;
				
			}
			
			
		}
		
	}
		

	public String toString()
	{
		
		String output="";
		for(int i = 0; i < wordRay.length;i++) {
			output = output + wordRay[i] + "\n";
		}
		
		return output+"\n\n";
	}
}
