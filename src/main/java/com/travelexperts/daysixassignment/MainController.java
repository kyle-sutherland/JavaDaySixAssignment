/**
 * Sample Skeleton for 'main-view.fxml' Controller Class
 */

package com.travelexperts.daysixassignment;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class MainController
{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnEdit"
    private Button btnEdit; // Value injected by FXMLLoader

    @FXML // fx:id="btnExit"
    private Button btnExit; // Value injected by FXMLLoader

    @FXML // fx:id="btnSave"
    private Button btnSave; // Value injected by FXMLLoader

    @FXML // fx:id="colAgencyId"
    private TableColumn<Agent, Integer> colAgencyId; // Value injected by FXMLLoader

    @FXML // fx:id="colAgentId"
    private TableColumn<Agent, Integer> colAgentId; // Value injected by FXMLLoader

    @FXML // fx:id="colAgtBusPhone"
    private TableColumn<Agent, String> colAgtBusPhone; // Value injected by FXMLLoader

    @FXML // fx:id="colAgtEmail"
    private TableColumn<Agent, String> colAgtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="colAgtFirstName"
    private TableColumn<Agent, String> colAgtFirstName; // Value injected by FXMLLoader

    @FXML // fx:id="colAgtLastName"
    private TableColumn<Agent, String> colAgtLastName; // Value injected by FXMLLoader

    @FXML // fx:id="colAgtMiddleInitial"
    private TableColumn<Agent, String> colAgtMiddleInitial; // Value injected by FXMLLoader

    @FXML // fx:id="colAgtPosition"
    private TableColumn<Agent, String> colAgtPosition; // Value injected by FXMLLoader

    @FXML // fx:id="tvAgents"
    private TableView<Agent> tvAgents; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgencyId"
    private TextField txtAgencyId; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgentId"
    private TextField txtAgentId; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgtBusPhone"
    private TextField txtAgtBusPhone; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgtEmail"
    private TextField txtAgtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgtFirstName"
    private TextField txtAgtFirstName; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgtLastName"
    private TextField txtAgtLastName; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgtMiddleInitial"
    private TextField txtAgtMiddleInitial; // Value injected by FXMLLoader

    @FXML // fx:id="txtAgtPosition"
    private TextField txtAgtPosition; // Value injected by FXMLLoader

    private final ObservableList<Agent> data = FXCollections.observableArrayList();
    private Agent selection;

    private boolean isEditing;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize()
    {
        assert btnEdit != null : "fx:id=\"btnEdit\" was not injected: check your FXML file 'main-view.fxml'.";
        assert btnExit != null : "fx:id=\"btnExit\" was not injected: check your FXML file 'main-view.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgencyId != null : "fx:id=\"colAgencyId\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgentId != null : "fx:id=\"colAgentId\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgtBusPhone != null : "fx:id=\"colAgtBusPhone\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgtEmail != null : "fx:id=\"colAgtEmail\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgtFirstName != null : "fx:id=\"colAgtFirstName\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgtLastName != null : "fx:id=\"colAgtLastName\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgtMiddleInitial != null : "fx:id=\"colAgtMiddleInitial\" was not injected: check your FXML file 'main-view.fxml'.";
        assert colAgtPosition != null : "fx:id=\"colAgtPosition\" was not injected: check your FXML file 'main-view.fxml'.";
        assert tvAgents != null : "fx:id=\"tvAgents\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgencyId != null : "fx:id=\"txtAgencyId\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgentId != null : "fx:id=\"txtAgentId\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgtBusPhone != null : "fx:id=\"txtAgtBusPhone\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgtEmail != null : "fx:id=\"txtAgtEmail\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgtFirstName != null : "fx:id=\"txtAgtFirstName\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgtLastName != null : "fx:id=\"txtAgtLastName\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgtMiddleInitial != null : "fx:id=\"txtAgtMiddleInitial\" was not injected: check your FXML file 'main-view.fxml'.";
        assert txtAgtPosition != null : "fx:id=\"txtAgtPosition\" was not injected: check your FXML file 'main-view.fxml'.";


        /*CUSTOM CODE*/
        colAgentId.setCellValueFactory(new PropertyValueFactory<Agent, Integer>("agentId"));
        colAgtFirstName.setCellValueFactory(new PropertyValueFactory<Agent, String>("agtFirstName"));
        colAgtMiddleInitial.setCellValueFactory(new PropertyValueFactory<Agent, String>("agtMiddleInitial"));
        colAgtLastName.setCellValueFactory(new PropertyValueFactory<Agent, String>("agtLastName"));
        colAgtBusPhone.setCellValueFactory(new PropertyValueFactory<Agent, String>("agtBusPhone"));
        colAgtEmail.setCellValueFactory(new PropertyValueFactory<Agent, String>("agtEmail"));
        colAgtPosition.setCellValueFactory(new PropertyValueFactory<Agent, String>("agtPosition"));
        colAgencyId.setCellValueFactory(new PropertyValueFactory<Agent, Integer>("agencyId"));
        tvAgents.setItems(data);
        isEditing = false;

        setControlsDisable();
        getAgents();

        tvAgents.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Agent>()
        {
            @Override
            public void changed(ObservableValue<? extends Agent> observableValue, Agent agent, Agent t1)
            {
                    selection = t1;
            }
        });

        btnEdit.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                btnEditClicked(mouseEvent);
            }
        });
        btnExit.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                btnExitClicked(mouseEvent);
            }
        });
        btnSave.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                btnSaveClicked(mouseEvent);
            }
        });

        tvAgents.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                setTextFields(selection);
            }
        });
    }

    private Properties getProperties()
    {
        try
        {
            FileInputStream fis = new FileInputStream("src/main/resources/com/travelexperts/daysixassignment/connection.properties");
            Properties p = new Properties();
            p.load(fis);
            return p;
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    private void getAgents()
    {
        data.clear();

        String url = "";
        String user = "";
        String password = "";

        try
        {
            Properties p = getProperties();
            url = (String) p.get("url");
            user = (String) p.get("user");
            password = (String) p.get("password");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from agents");
            while (rs.next())
            {
                data.add(new Agent(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
            }
            connection.close();
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    private void editAgent()
    {
        String url = "";
        String user = "";
        String password = "";

        Properties p = getProperties();
        url = (String) p.get("url");
        user = (String) p.get("user");
        password = (String) p.get("password");
        try
        {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "";
            sql = "UPDATE agents SET AgtFirstName=?," +
                    "AgtMiddleInitial=?," +
                    "AgtLastName=?," +
                    "AgtBusPhone=?," +
                    "AgtEmail=?," +
                    "AgtPosition=?," +
                    "AgencyId=?" +
                    " WHERE AgentId=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, txtAgtFirstName.getText());
            statement.setString(2, txtAgtMiddleInitial.getText());
            statement.setString(3, txtAgtLastName.getText());
            statement.setString(4, txtAgtBusPhone.getText());
            statement.setString(5, txtAgtEmail.getText());
            statement.setString(6, txtAgtPosition.getText());
            statement.setInt(7, Integer.parseInt(txtAgencyId.getText()));
            statement.setInt(8, Integer.parseInt(txtAgentId.getText()));
            int rows = statement.executeUpdate();
            if (rows == 0)
            {
                System.out.println("Update failed");
            }
            connection.close();
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    private void setTextFields(@NotNull Agent a)
    {
        txtAgentId.setText(a.getAgentId() + "");
        txtAgtFirstName.setText(a.getAgtFirstName());
        txtAgtMiddleInitial.setText(a.getAgtMiddleInitial());
        txtAgtLastName.setText(a.getAgtLastName());
        txtAgtBusPhone.setText(a.getAgtBusPhone());
        txtAgtEmail.setText(a.getAgtEmail());
        txtAgtPosition.setText(a.getAgtPosition());
        txtAgencyId.setText(a.getAgencyId() + "");
    }

    private void setControlsDisable()
    {
        btnSave.setDisable(!isEditing);
        txtAgencyId.setDisable(true);
        txtAgtPosition.setDisable(!isEditing);
        txtAgtEmail.setDisable(!isEditing);
        txtAgtBusPhone.setDisable(!isEditing);
        txtAgtMiddleInitial.setDisable(!isEditing);
        txtAgtFirstName.setDisable(!isEditing);
        txtAgtLastName.setDisable(!isEditing);
        txtAgentId.setDisable(!isEditing);
    }

    private void btnExitClicked(MouseEvent mouseEvent)
    {
        System.exit(0);
    }

    private void btnEditClicked(MouseEvent mouseEvent)
    {
        isEditing = !isEditing;
        setControlsDisable();
    }

    private void btnSaveClicked(MouseEvent mouseEvent)
    {
        editAgent();
        getAgents();
        tvAgents.setItems(data);
    }
}