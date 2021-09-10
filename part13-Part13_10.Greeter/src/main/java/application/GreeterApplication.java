package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //first layout elements
        Label instruction = new Label("Enter your name and start");
        TextField login = new TextField();
        Button buttonLogin = new Button("Log in");
        Label errorMsg = new Label("");

        //layout
        GridPane layout = new GridPane();

        layout.add(instruction, 0, 0);
        layout.add(login, 0, 1);
        layout.add(buttonLogin, 0, 2);
        layout.add(errorMsg, 0, 3);

        //styling layout
//        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        //Scene first layout
        Scene sceneLoginView = new Scene(layout);

        //Second layout elements
        Label textWelcome = new Label();

        StackPane welcomeLayout = new StackPane();
//        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(textWelcome);
        welcomeLayout.setPadding(new Insets(20, 20, 20, 20));
        welcomeLayout.setAlignment(Pos.CENTER);

        //Scene second layout
        Scene sceneLoggedIn = new Scene(welcomeLayout);

        //functions
        buttonLogin.setOnAction((event) -> {
            textWelcome.setText("Welcome " + login.getText() + "!");
            stage.setScene(sceneLoggedIn);
        });

        stage.setScene(sceneLoginView);
        stage.show();
    }
}
