module com.travelexperts.daysixassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.travelexperts.daysixassignment to javafx.fxml;
    exports com.travelexperts.daysixassignment;
}