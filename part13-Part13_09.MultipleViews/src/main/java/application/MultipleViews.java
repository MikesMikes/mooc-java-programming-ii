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

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane scene1 = new BorderPane();
        Button buttonFirstScene = new Button("To the second view!");
        Label label1 = new Label("First View!");

        scene1.setTop(label1);
        scene1.setCenter(buttonFirstScene);

        Scene first = new Scene(scene1);

        //Scene2 layout
        VBox scene2 = new VBox();
        Button buttonSecondScene = new Button("To the third view!");
        Label vboxText = new Label("Second view!");

        scene2.getChildren().addAll(buttonSecondScene, vboxText);

        Scene second = new Scene(scene2);

        //Scene3
        GridPane scene3 = new GridPane();
        Label TextThirdScene = new Label("Third view!");
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
        stage.show();    }

}
