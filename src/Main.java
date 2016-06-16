import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;


public class Main extends Application{

    Text scenetitle = new Text("Welcome");
    Label username = new Label("Username: ");
    TextField userTextField = new TextField();
    Label pw = new Label("Password: ");
    PasswordField pwBox = new PasswordField();
    Button signin = new Button("Sign in");
    Button signup = new Button("Sign up");
    HBox hbBtn = new HBox(4);
    Text actiontarget = new Text();

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(50, 50, 50, 50));

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);

        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        grid.add(scenetitle, 0, 0 ,2 ,1);
        grid.add(username,0, 1);
        grid.add(userTextField, 1, 1);
        grid.add(pw, 0, 2);
        grid.add(pwBox, 1, 2);
        grid.add(actiontarget, 1, 4);
        grid.add(hbBtn, 1, 3);

        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(signup);
        hbBtn.getChildren().add(signin);

        signin.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                actiontarget.setFill(Color.RED);
                actiontarget.setText("Sign in Pressed");
            }
        });

        signup.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                actiontarget.setFill(Color.CADETBLUE);
                actiontarget.setText("Sign up Pressed");
            }
        });

        primaryStage.show();
    }




}
