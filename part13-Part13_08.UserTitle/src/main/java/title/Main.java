package title;

import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Application.launch(UserTitle.class,
            "--something=Once upon a time",
            "--course=Title");
    }

}
