package Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;

//import JavaFx.scene.image;
/**
 * Class that creates a superSmashBrothersCharacterObject
 * Object will contain data for the character such as Name
 * A picture of the character, and what version of the game
 * @author Nick Hale
 *
 */
public class SmashCharacter 
{
       
       private String name;
       private Image picture;
       
       /**
       * Default Constructor to create a new SmashCharacter
       */
       public SmashCharacter()
       {
              name = "null";
              picture = null;
              
       }
       /**
       * Create a new SmashCharacter from the given information
       * found in the file
       * @param information , A line from the file
       */
       public SmashCharacter(String information)
       {
              String[] info = information.split("\t");
              this.name = info[0];
              this.picture = new Image(info[1]);
             
              
       }
       /**
       * return name of character
       * @return the name of this SmashCharacter
       */
       public String getName()
       {
              return this.name;
              
       }
       
       
       public Image getPicture()
       {
              return this.picture;
       }
       

}

