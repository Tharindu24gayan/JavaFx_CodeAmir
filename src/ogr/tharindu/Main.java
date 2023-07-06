
package ogr.tharindu;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.Group;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group gr=new Group();

        Label l1 = new Label("Welcome to javaWelcome to javaWelcome to javaWelcome to javaWelcome to javaWelcome to java");
        l1.setPrefWidth(450);
        l1.setPrefHeight(300);
        l1.setAlignment(Pos.CENTER);
        l1.setWrapText(true);
        l1.setTextFill(Color.RED);
        l1.setTooltip(new Tooltip("code amir JAVAFX is selected"));
        l1.setFont(Font.font("Tahoma", FontWeight.BOLD, 48));

        primaryStage.show();
        
        gr.getChildren().add(l1);
        Scene sc = new Scene(gr);
        primaryStage.setScene(sc);
        
        primaryStage.setTitle("Code Amir");
        primaryStage.setWidth(450);
        primaryStage.setHeight(300);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
