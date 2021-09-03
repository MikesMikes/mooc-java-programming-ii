package buttonandlabel;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Button;


public class ButtonAndLabelApplication extends Application{

    @Override
    public void start(Stage window){
        Label text = new Label("This is a text");
        Button button = new Button("OK");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(text);
        componentGroup.getChildren().add(button);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }
    
    
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
