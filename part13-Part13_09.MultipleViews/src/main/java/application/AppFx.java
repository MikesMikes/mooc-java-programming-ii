/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author micha
 */
public class AppFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Scene1 layout

        BorderPane scene1 = new BorderPane();
        Button buttonFirstScene = new Button("To the second view!");
        Label label1 = new Label("First View!");

        scene1.setTop(label1);
        scene1.setCenter(buttonFirstScene);

        Scene first = new Scene(scene1);

        //Scene2 layout
        VBox scene2 = new VBox();
        Button buttonSecondScene = new Button("To the third view!");
        Text vboxText = new Text("Second view!");

        scene2.getChildren().addAll(buttonSecondScene, vboxText);

        Scene second = new Scene(scene2);

        //Scene3
        GridPane scene3 = new GridPane();
        Text TextThirdScene = new Text("Third view!");
        Button ButtonThirdScene = new Button("To the first view!");
        scene3.add(TextThirdScene, 0, 0);
        scene3.add(ButtonThirdScene, 1, 1);
        
        Scene third = new Scene(scene3);

//        functions
        buttonFirstScene.setOnAction((event) -> {
            stage.setScene(second);
        });
        
        buttonSecondScene.setOnAction((event) -> {
            stage.setScene(third);
        });
        
        ButtonThirdScene.setOnAction((event) -> {
            stage.setScene(first);
        });
        
        stage.setScene(first);
        stage.show();
    }

}
