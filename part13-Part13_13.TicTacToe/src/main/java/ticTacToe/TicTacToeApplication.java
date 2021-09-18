package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //high level layout
        int player = 1;
        BorderPane layout = new BorderPane();
        Label turn = new Label("Turn: X");

        GridView grid= new GridView(player, turn);
        
        //Elements
        
        //Layout collect
        layout.setTop(turn);
        layout.setCenter(grid.getView());
        
        //Scene
        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}
