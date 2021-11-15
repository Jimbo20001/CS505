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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class TaborGradeBookApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Label labelFirstName = new Label("First Name:"); //First name value
    Label labelLastName = new Label("Last Name:"); //Last name value
    Label labelCourse = new Label("Course:"); //Course name value
    Label labelGrade = new Label("Grade:"); //Grade value

    //Text fields for when the user enters the values in
    TextField textFirstName = new TextField();
    TextField textLastName = new TextField();
    TextField textCourse = new TextField();

    ComboBox Grade = new ComboBox();

    //Values that tell the user what each button does
    Button clearButton = new Button("Clear Gradebook Entry");
    Button viewSavedGradesButton = new Button("View Saved Grades");
    Button saveGradebookEntry = new Button("Save Gradebook Entry");

    Label labelSavedGrade = new Label("Saved Grade: ");
    GridPane pane = new GridPane();

    String newText;

    TableView table = new TableView();

    TableColumn firstNameColumn = new TableColumn("First Name");
    TableColumn lastNameColumn = new TableColumn("Last Name");
    TableColumn courseColumn = new TableColumn("Course");
    TableColumn gradeColumn = new TableColumn("Grade");


    @Override
    public void start(Stage primaryStage) {

        primaryStage.setWidth(750);
        primaryStage.setHeight(500);

        // GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(labelFirstName, 0, 0); //Creates field where first name will be entered
        pane.add(textFirstName, 2, 0); //Takes user input of first name

        pane.add(labelLastName, 0, 1); //Creates field where last name will be entered
        pane.add(textLastName, 2, 1); //Takes user input of last name

        pane.add(labelCourse, 0, 2); //Creates field where course name will be entered
        pane.add(textCourse, 2, 2); //Takes user input of course name

        Grade.setPromptText("Select Grade"); //Asks user what the letter grade for the class was
        Grade.getItems().addAll("-", "A", "B", "C", "D", "F");

        pane.add(labelGrade, 0, 3); //Creates field for label grade
        pane.add(Grade, 2, 3);

        HBox actionButtonContainer = new HBox();

        actionButtonContainer.setPadding(new Insets(0, 0, 0, 0));
        actionButtonContainer.setSpacing(15);
        actionButtonContainer.getChildren().add(saveGradebookEntry); //Creates save grade button
        actionButtonContainer.getChildren().add(clearButton); //Creates clear button
        actionButtonContainer.getChildren().add(viewSavedGradesButton); //Creates view grades button

        pane.add(actionButtonContainer, 1,5);

        //Creates the interface which will allow users to write grades to them
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Tabor Grade Book App");
        primaryStage.setScene(scene);
        primaryStage.show();

        saveGradebookEntry.setOnAction(e -> {
            try {
                saveEnteredGrade();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        viewSavedGradesButton.setOnAction(e -> viewGrades()); //View grades when user presses button
        clearButton.setOnAction(e -> clearGradebookEntry()); //Clear grades when user presses button

    }

    /**
     * Creates a new grades.csv
     * Writes firstName, lastName, course, & grade headers to the file
     * @throws IOException
     */
    private void saveEnteredGrade() throws IOException {

        File file = new File("GradeBookApp/grades.csv"); //Creates new file
        FileWriter csvWriter = new FileWriter(file, true); //Makes sure the file exists
        csvWriter.append(textFirstName.getText() + "," + textLastName.getText() + "," + textCourse.getText() + "," + Grade.getValue() + "\n"); //Writes the values to the file
        csvWriter.close(); //Ends writing here

    }

    /*
    *Double checks if the file exists
    *Reads CSV file when found
    *If it doesn't exist the file will not be read
    */
    private void readCSV()  {     
        try {
            Scanner scan = new Scanner(new File("GradeBookApp/grades.csv"));
            scan.useDelimiter(",");
            while (scan.hasNext()) {
                System.out.print(scan.next() + " ");
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Clear button functions when pressed
    //Clears all contens from the file
    private void clearGradebookEntry() {
        textFirstName.setText("");
        textLastName.setText("");
        textCourse.setText("");
        Grade.setValue("-");
    }

    //When view grades button is pressed reads all the grades from file
    //Produces them in a column format for each person
    private void viewGrades() {
        table.setEditable(true);
        table.getColumns().addAll(firstNameColumn, lastNameColumn, courseColumn, gradeColumn);
        pane.add(table, 1, 6);
        readCSV();
    }
}