/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogr.tharindu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("code Amir");
        primaryStage.setWidth(450);
        primaryStage.setHeight(300);
        
        primaryStage.setMinWidth(550);
        primaryStage.setMinHeight(350);
        
        primaryStage.setMaxWidth(750);
        primaryStage.setMaxHeight(550);
        
        primaryStage.setX(50);
        primaryStage.setY(550);
        
        primaryStage.setOpacity(0.5);
        
        primaryStage.setResizable(true);
        
        
        
        
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
