import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception{
        View view = new View(primaryStage);
        System.out.println("HEI");
    }

    public static void main(String[] args) {
        launch(args);
    }


}

