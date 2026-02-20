package ChatApplicationFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        Text text_login = new Text(10, 20, "Login");
        TextField textField = new TextField();
        Text text_password = new Text(10, 60, "Password");
        PasswordField password = new PasswordField();
        Button button = new Button("Login");
        
        gridPane.add(text_login, 0, 0);
        gridPane.add(textField, 0, 1);
        gridPane.add(text_password, 0, 2);
        gridPane.add(password, 0, 3);
        gridPane.add(button, 0, 4);
        
        primaryStage.setScene(new Scene(gridPane, 400, 300));
        primaryStage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String login = textField.getText();
                String pass = password.getText();
                System.out.println("Login: " + login + ", Password: " + pass); //Print login and password to console for testing
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}