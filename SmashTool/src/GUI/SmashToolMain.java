package GUI;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import Application.SmashCharacter;
import Application.SmashCharacterRoster;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SmashToolMain extends Application implements Initializable{
	
		Random numGenerator = new Random();
       
       /*
       public SmashCharacterRoster smash4 =
                     new SmashCharacterRoster("Assets/ultimate");
       public SmashCharacterRoster brawl = 
                     new SmashCharacterRoster("brawl");
       public SmashCharacterRoster melee =
                     new SmashCharacterRoster("melee");
       public SmashCharacterRoster smash64 =
                     new SmashCharacterRoster("smash64");
                     */
       
       
       public static void main(String [] args) 
       {
    	   launch(args);
    	   
              
       }
       
    @FXML Button fight;
   	@FXML Text p1Text;
   	@FXML Text p2Text;
   	@FXML ImageView logoImage;
   	@FXML ImageView p1f1picture;
   	@FXML ImageView p1f2picture;
   	@FXML ImageView p1f3picture;
   	@FXML ImageView p2f1picture;
   	@FXML ImageView p2f2picture;
   	@FXML ImageView p2f3picture;
   	@FXML Text p1f1name;
   	@FXML Text p1f2name;
   	@FXML Text p1f3name;
   	@FXML Text p2f1name;
   	@FXML Text p2f2name;
   	@FXML Text p2f3name;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fight.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				SmashCharacter [] playableFighters = ultimate.determineCharacters();
				//set player 1 fighter names
				p1f1name.setText(playableFighters[0].getName());
				p1f2name.setText(playableFighters[1].getName());
				p1f3name.setText(playableFighters[2].getName());
				//set player 2 fighter names
				p2f1name.setText(playableFighters[3].getName());
				p2f2name.setText(playableFighters[4].getName());
				p2f3name.setText(playableFighters[5].getName());
				//set player 1 fighter pictures
				p1f1picture.setImage(playableFighters[0].getPicture());
				p1f2picture.setImage(playableFighters[1].getPicture());
				p1f3picture.setImage(playableFighters[2].getPicture());
				//set player 2 fighter pictures
				p2f1picture.setImage(playableFighters[3].getPicture());
				p2f2picture.setImage(playableFighters[4].getPicture());
				p2f3picture.setImage(playableFighters[5].getPicture());
				
				/*
				p1Text.setText(
						String.format("Player 1%n%s%n%s%n%s%n", 
								playableFighters[0].getName(), playableFighters[1].getName(), playableFighters[2].getName()));
				
				p2Text.setText(
						String.format("Player 2%n%s%n%s%n%s%n", 
								playableFighters[3].getName(), playableFighters[4].getName(), playableFighters[5].getName()));
				logoImage.setImage(playableFighters[1].getPicture());
				*/
				
				
				
			}
		});
		
		
	}
	
	
	SmashCharacterRoster ultimate = 
            new SmashCharacterRoster("C:\\Users\\halen\\git\\SmashTool\\SmashTool\\src\\Application\\ultimateRoster.txt");
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage window;
		window = primaryStage;
		window.setTitle("Smash Bo5 Conquest Generator");
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("bootMenu.fxml"));
		final AnchorPane root = loader.load();
		//Parent root = FXMLLoader.load(getClass().getResource("bootMenu.fxml"));
		Scene Boot = new Scene(root);
		primaryStage.setScene(Boot);
		//Boot.getStylesheets().add(Main.class.getResource("/application.css").toExternalForm());
		primaryStage.show();
		
		
		
	}

/*
	@Override
	public void start(Stage arg0) throws Exception {
		
		SmashCharacter[] selectedFighters = new SmashCharacter[6];
 	   	SmashCharacterRoster currentGame = ultimate;
 	   	System.out.print(currentGame.toString());
 	   	//selectedFighters = currentGame.ChooseSmashCharacters;
 	   	 * 
 	   	 * 
 	   	 *
 	   	 */
 	   
 	   
 	
		
	

}
