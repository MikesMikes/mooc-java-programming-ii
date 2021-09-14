package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    
    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception{
        this.dictionary = new Dictionary();
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        //create views
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);
        
        //create higher level layout
        BorderPane layout = new BorderPane();
        
        //Create menu for general layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(10));
        menu.setSpacing(10);
        
        //create menu buttons
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");
        
        //add buttons to menu
        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);
        
        //connect subviews with buttons
        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));
        
        //Initiate first view
        layout.setCenter(inputView.getView());
        
        //Create main view and add high level layout
        Scene scene = new Scene(layout, 400, 300);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
