/*
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 * Comprehensive Version (12th ed.). Pearson Education, Inc.
 * Modified by R. Krasso 2021
 * Additional modifications by A. Student 2021
 */
/*
 * Tabor, J. (2021). CIS 505 Intermediate Java Programming. 
 * Bellevue University.
 */

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TaborFutureValueApp extends Application {

    //Main Method
    public static void main(String[] args) {
        launch(args);
    }
    //End of Main

    @Override
    public void start(Stage primaryStage) {
        
        //Creating a monthly payment area and interestrate area for user input
        TextField TextMonthlyPayment = new TextField();
        TextField TextInterestRate = new TextField();

        //Creating textara to input results
        TextArea Area = new TextArea();

        //All five labels are given specific objects
        Label LabelMonthlyPayment = new Label("Monthly Payment:");
        Label LabelInterestRate = new Label("Interest Rate:");
        Label LabelYears = new Label("Years:");
        Label LabelInterestRateFormat = new Label("Enter 11.1% as 11.1");
        Label LabelFuture = new Label();

        //ComboBox specifics with an integer
        ComboBox<Integer> Years = new ComboBox<Integer>();

        //Buttons being made here with specific attributes
        Button CalculateButton = new Button("Calculate");
        Button ClearButton = new Button("Clear");

        //Creating a new gridpane object that will have measurements
        GridPane Pane = new GridPane();

        //Specific mearurements made here for GridPane
        Pane.setAlignment(Pos.CENTER);
        Pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        Pane.setHgap(5.5);
        Pane.setVgap(5.5);

        //Interestrate measurement specifics and color
        LabelInterestRateFormat.setTextFill(Color.RED);
        Pane.add(LabelInterestRateFormat, 1, 2);
        Pane.setHalignment(LabelInterestRateFormat, HPos.RIGHT);

        //Monthlypayment specific measurements and locations
        Pane.add(LabelMonthlyPayment, 0, 0);
        Pane.add(TextMonthlyPayment, 1, 0);

        //InterestRate specific measurements and locations
        Pane.add(LabelInterestRate, 0, 1);
        Pane.add(TextInterestRate, 1, 1);

        //Years specific measurements and locations
        Pane.add(LabelYears, 0, 3);
        Pane.add(Years, 1, 3);

        //Area and Future specific measurements and placement
        Pane.add(Area, 0, 6, 2, 1);
        Pane.add(LabelFuture, 0, 5);
        GridPane.setHalignment(Years, HPos.LEFT);

        //Creating a new object that will put the buttons clear and calculate in order
        HBox ButtonContainer = new HBox();
        ButtonContainer.setPadding(new Insets(15, 0, 15, 30));
        ButtonContainer.setSpacing(10);
        ButtonContainer.getChildren().add(ClearButton);
        ButtonContainer.getChildren().add(CalculateButton);
        Pane.add(ButtonContainer, 1, 4);

        //Draws window and creates the size of the scene based on the GridPane
        Scene scene = new Scene(pane, 300, 450));
        primaryStage.setTitle("Tabor Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    
}
