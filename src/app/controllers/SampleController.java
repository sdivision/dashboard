package app.controllers;

import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.net.URL;
import java.util.ResourceBundle;

public class SampleController implements Initializable{

    public void handleClickAction(Event event){

        Notifications notificationBuilder = Notifications.create()
                .title("Notification")
                .text("Action performed!")
                .graphic(null)
                .hideCloseButton()
                .hideAfter(Duration.seconds(3))
                .position(Pos.CENTER);
        notificationBuilder.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
