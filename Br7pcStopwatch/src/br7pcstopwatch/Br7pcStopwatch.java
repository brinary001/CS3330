/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br7pcstopwatch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author brianrobinson
 */
public class Br7pcStopwatch extends Application {
    
  private String appName = "Stopwatch Challenge";
    
    @Override
    public void start(Stage primaryStage) {
        StopWatch stopwatch = new StopWatch();
        
        Scene scene = new Scene(stopwatch.getRootContainer(),
                                stopwatch.getWidth(), 
                                stopwatch.getHeight());     
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
