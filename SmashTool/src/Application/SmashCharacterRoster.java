package Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Object that contains an array of SmashChracters
 * Used to differntiate the different smash games
 * @author nickhale
 *
 */
public class SmashCharacterRoster {
	
	private ArrayList<SmashCharacter> roster = new ArrayList<SmashCharacter>();
	Random rng = new Random();

       public SmashCharacterRoster(String string)
       {
    	   File rosterData = new File(string);
    	   Scanner readFile;
		try {
			SmashCharacter currentFighter;
			readFile = new Scanner(rosterData);
			while(readFile.hasNext())
	    	   {
	    		   currentFighter = new SmashCharacter(readFile.nextLine());
	    		   roster.add(currentFighter);
	    	   }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    	     
       }
       
       public SmashCharacter[] determineCharacters()
       {
    	   SmashCharacter[] fighters = new SmashCharacter[6];
    	   SmashCharacter currentCharacter;
    	   boolean inArray;
    	   int i = 0;
    	   while(i != fighters.length)
    	   {
    		   inArray = false;
    		   currentCharacter = this.getRandomFighter();
    		   for(int j = 0; j < i; j++)
    		   {
    			   if(currentCharacter.equals(fighters[j]))
					{
						inArray = true;
					}
    		   }
    		   if(!inArray)
    		   {
    			   fighters[i] = currentCharacter;
    			   i++;
    		   }
    		   
    	   }
    	   
    	   return fighters;
       }
       
       private SmashCharacter getRandomFighter() 
       {
    	   return roster.get(rng.nextInt(roster.size()));
       }

	public String toString() 
       {
    	   StringBuilder entireRoster = new StringBuilder();
    	   for(int i = 0; i < roster.size(); i ++)
    	   {
    		   entireRoster.append(roster.get(i).getName());
    		   entireRoster.append("\n");
    		   
    		   
    	   }
    	  
    	   
    	   return entireRoster.toString();
       }

}

