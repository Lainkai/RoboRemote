package net.bak3dnet.RoboRemote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import net.bak3dnet.RoboRemote.customNodes.Input.VariableInput;

public class Starter extends Application {

	final Logger logger = LoggerFactory.getLogger(Starter.class);
	
	public static void main(String[] args) {

		launch(args);
		
	}

	int inputVal = 255;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		TilePane mainPane = new TilePane();		
		
		VariableInput throttle = new VariableInput();
		throttle.setPercentage(inputVal);
		
		Button b = new Button("Reduce Percentage");
		b.setOnAction((event) -> {
			
			inputVal = inputVal-1;
			throttle.setPercentage(inputVal);
			
		});
		
		Button c = new Button("Increase Percentage");
		c.setOnAction((event) -> {
			
			inputVal = inputVal+1;
			throttle.setPercentage(inputVal);
			
		});
		
		mainPane.getChildren().addAll(throttle,b,c);
		
		Scene mainScene = new Scene(mainPane, 1280, 720);
		
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("RoboControl");
		//primaryStage.getIcons().add(new Image());
		primaryStage.show();
		
		
	}
	
	

}
