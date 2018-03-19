package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    Controller ctrl = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button button2 = new Button("Accept");
        DropShadow shadow = new DropShadow();
        button2.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            button2.setEffect(shadow);
        });
        button2.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            button2.setEffect(null);
        });

        HBox hbox = new HBox();
        hbox.getChildren().add(button2);


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //
        Scene scene = new Scene(new Group());
        ((Group) scene.getRoot()).getChildren().add(hbox);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
