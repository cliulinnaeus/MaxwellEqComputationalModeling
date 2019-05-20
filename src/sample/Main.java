package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        // static field generation for conductor and nonconductor (E and B)
        // be able to toggle E and B
        // particle motion in E and B
        // light/radiation
        // be able to click on a stationary/moving particle and adjust its velo, pos, charge
        // field and obj(charge and current)
        // programmable charge/current density
        // can generate field of molecular structure like graphene



    }
}
