import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;


import javax.swing.*;

/**
 * This panel is the basic panel, inside which other panels are placed.
 * Before beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

    //student Task #2:
    //  declare five buttons, a label, and a textfield
    JButton button_hello = new JButton("Hello");
    JButton button_exit = new JButton("Exit");
    JButton button_Chinese = new JButton("Chinese");
    JButton button_clear = new JButton("clear");
    JButton button_howdy = new JButton("Howdy");
    JLabel label_feedback = new JLabel("Feedback");
    JTextField textField = new JTextField();
    //  declare two HBoxes
    HBox hBox = new HBox();
    HBox hbox = new HBox();
    //student Task #4:
    //  declare an instance of DataManager
    /**
     * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
     * wait to add a component to its containing component until the container has
     * been created.  This is the only constraint on the order in which the following
     * statements appear.
     */
    FXMainPane() {
        //student Task #2:
        //  instantiate the buttons, label, and textfield
        Button button_hello  = new Button("hello");
        Button button_exit = new Button("exit");
        Button button_Chinese = new Button("chinese");
        Button button_clear = new Button("clear");
        Button button_howdy = new Button("howdy");
        Label label_feedback = new Label("Feedback");
        TextField textField = new TextField();
        //  instantiate the HBoxes
        HBox Box = new HBox();
        HBox box = new HBox();

        //student Task #4:
        //  instantiate the DataManager instance
        DataManager data = new DataManager();
        //  set margins and set alignment of the components
        Box.setAlignment(Pos.CENTER);
        box.setAlignment(Pos.CENTER);
        //student Task #3:
        //  add the label and textfield to one of the HBoxes
        hBox.getChildren().addAll(label_feedback, textField);
        //  add the buttons to the other HBox
        hbox.getChildren().addAll(button_Chinese,button_clear,button_exit,button_hello,button_howdy);
        //  add the HBoxes to this FXMainPanel (a VBox)
        getChildren().addAll(button_Chinese,button_clear,button_exit,button_hello,button_howdy);

    }

    //Task #4:
    //  create a private inner class to handle the button clicks
    private class ButtonHandler implements EventHandler <ActionEvent> {
        DataManager dataManager = new DataManager();
        public void handle(ActionEvent event) {
            if(event.getTarget() == button_hello) {
                String input = dataManager.getHello();
                textField.setText(input);
            } else if (event.getTarget() == button_howdy) {
                String input = dataManager.getHowdy();
                textField.setText(input);
            } else if (event.getTarget() == button_Chinese) {
                String input = dataManager.getChinese();
                textField.setText(input);
            } else if (event.getTarget() == button_clear) {
                textField.setText("");
            } else if (event.getTarget() == button_exit) {
                Platform.exit();
                System.exit(0);
            }
        }
    }
}

