/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br7pcgradecalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

/**
 *
 * @author br7pc
 * Brian Robinson
 */
public class Br7pcGradeCalculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(15);
        root.setVgap(15);
        root.setPadding(new Insets(0, 0, 15, 0));
        
        VBox controls = new VBox();
        Button maximize = new Button("Maximize");
        Button calculate = new Button("Calculate");
        Button clear = new Button("Clear");
        Button alert = new Button("Alert");
        maximize.setMaxWidth(Double.MAX_VALUE);
        calculate.setMaxWidth(Double.MAX_VALUE);
        clear.setMaxWidth(Double.MAX_VALUE);
        alert.setMaxWidth(Double.MAX_VALUE);
        controls.setAlignment(Pos.BOTTOM_CENTER);
        controls.setSpacing(15);
        controls.setPadding(new Insets(0, 0, 15, 0));
        controls.getChildren().addAll(maximize, calculate, clear, alert);
        root.add(controls,0,7);
        
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
        Label label1 = new Label("Category 1 (30%):");
        root.add(label1, 0, 1);
        
        TextField Score1 = new TextField();
        Score1.setPrefWidth(400); 
        root.add(Score1, 0, 2);
        
        //String str = Score1.getString();
        
        Label label2 = new Label("Category 2 (70%):");
        root.add(label2, 0, 3);
        
        TextField Score2 = new TextField(); 
        Score1.setPrefWidth(400); 
        root.add(Score2, 0, 4);
        
        Label label3 = new Label("My Final Score:");
        root.add(label3, 0, 5);
        
        TextField Score3 = new TextField();
        Score1.setPrefWidth(400); 
        root.add(Score3, 0, 6);
        
        maximize.setOnAction((ActionEvent event) -> {
            String Default = "100";
            Score1.setText(Default);
            Score2.setText(Default);
        });
        
        calculate.setOnAction((ActionEvent event) -> {
            String score1String = Score1.getText();
            double score1Val = Double.parseDouble(score1String);
            String score2String = Score2.getText();
            double score2Val = Double.parseDouble(score2String);
            double finalVal = score1Val * .3 + score2Val * .7;
            String displayMessage = "My final score should be " + score1String + " * 0.3 + " + score2String + " * 0.7 = " + finalVal;
            Score3.setText(displayMessage);
        });
        
        clear.setOnAction((ActionEvent event) -> {
            Score1.clear();
            Score2.clear();
            Score3.clear();
        });
        
        alert.setOnAction((ActionEvent event) -> {
            Alert popUp = new Alert(Alert.AlertType.INFORMATION);
            popUp.setTitle("Alert");
            popUp.setContentText(Score3.getText());
            popUp.show();
        });
        
        Scene scene = new Scene(root, 500, 400);
        
        primaryStage.setTitle("Grade Calculator");
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



    /*private static double invokeMe(double finalScore) {
        double finalScore;
        finalScore = Score1 * 0.3 + Score2 * 0.7;
        return finalScore;
    }

/*BONUS

saveItem.setOnAction(ActionEvent event) -> {
    FileChooser chooser = new FileChooser();

    File file = choose.showSaveDialog(primaryStage);

    if (file != null) {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(editor.getText());
        writer.close();
}
}
*/