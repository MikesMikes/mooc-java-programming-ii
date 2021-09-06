package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox layout = new VBox();
        
        //elements
        TextField topField = new TextField("");
        Button button = new Button("Copy");
        Label label = new Label("");
        
        //functions
        button.setOnAction((event) -> {
            label.setText(topField.getText());
        });
        
        layout.getChildren().addAll(topField, button, label);
        
        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
                
    }

}
