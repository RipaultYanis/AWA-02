/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Appli extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label lblValeur = new Label ( "0" ) ;
        Button btnInc = new Button( "Incrémenter" );
        Button btnQuitter = new Button( "Quitter" );
        
        
        btnQuitter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        
        VBox root = new VBox();
        
        root.getChildren().add( lblValeur );
        root.getChildren().add( btnInc );
        root.getChildren().add( btnQuitter );
        
        
        
        btnInc.setOnAction(new EventHandler<ActionEvent>() {
            
            int count = 0 ;
            
            @Override
            public void handle(ActionEvent event) {
                count++;
                String countStr = Integer.toString(count);
                //Label lblValeurNew = new Label (countStr);
                lblValeur.setText(countStr);
                
            }
        });
        
        
        Scene scene = new Scene( root , 300 , 250 );
        
        primaryStage.setTitle( "AWA-VBox" );
        primaryStage.setScene( scene );
        primaryStage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
