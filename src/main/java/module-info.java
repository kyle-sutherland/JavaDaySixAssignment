module com.travelexperts.daysixassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.jetbrains.annotations;


    opens com.travelexperts.daysixassignment to javafx.fxml;

    exports com.travelexperts.daysixassignment;
}