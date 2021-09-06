package myFirstApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyFirstApplication extends Application{
    

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My first application");
        Button button = new Button("This a button");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        
        Scene scene = new Scene(componentGroup);

        stage.setScene(scene);
        stage.show();
    }
}
