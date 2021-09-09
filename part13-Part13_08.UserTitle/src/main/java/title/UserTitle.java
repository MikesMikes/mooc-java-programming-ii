package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parameters params = getParameters();
        String something = params.getNamed().get("title");
        
        stage.setTitle(something);
        stage.show();
    }


}
