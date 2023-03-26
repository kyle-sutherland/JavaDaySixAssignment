package com.travelexperts.daysixassignment;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Agent
{
    private final SimpleIntegerProperty agentId;
    private final SimpleStringProperty agtFirstName;
    private final SimpleStringProperty agtMiddleInitial;
    private final SimpleStringProperty agtLastName;
    private final SimpleStringProperty agtBusPhone;
    private final SimpleStringProperty agtEmail;
    private final SimpleStringProperty agtPosition;
    private final SimpleIntegerProperty agencyId;

    public Agent(int agentId, String agtFirstName, String agtMiddleInitial, String agtLastName,
                 String agtBusPhone, String agtEmail, String agtPosition, int agencyId)
    {
        this.agentId = new SimpleIntegerProperty(agentId);
        this.agtFirstName = new SimpleStringProperty(agtFirstName);
        this.agtMiddleInitial = new SimpleStringProperty(agtMiddleInitial);
        this.agtLastName = new SimpleStringProperty(agtLastName);
        this.agtBusPhone = new SimpleStringProperty(agtBusPhone);
        this.agtEmail = new SimpleStringProperty(agtEmail);
        this.agtPosition = new SimpleStringProperty(agtPosition);
        this.agencyId = new SimpleIntegerProperty(agencyId);
    }

    public int getAgentId()
    {
        return agentId.get();
    }

    public void setAgentId(int agentId)
    {
        this.agentId.set(agentId);
    }

    public SimpleIntegerProperty agentIdProperty()
    {
        return agentId;
    }

    public String getAgtFirstName()
    {
        return agtFirstName.get();
    }

    public void setAgtFirstName(String agtFirstName)
    {
        this.agtFirstName.set(agtFirstName);
    }

    public SimpleStringProperty agtFirstNameProperty()
    {
        return agtFirstName;
    }

    public String getAgtMiddleInitial()
    {
        return agtMiddleInitial.get();
    }

    public void setAgtMiddleInitial(String agtMiddleInitial)
    {
        this.agtMiddleInitial.set(agtMiddleInitial);
    }

    public SimpleStringProperty agtMiddleInitialProperty()
    {
        return agtMiddleInitial;
    }

    public String getAgtLastName()
    {
        return agtLastName.get();
    }

    public void setAgtLastName(String agtLastName)
    {
        this.agtLastName.set(agtLastName);
    }

    public SimpleStringProperty agtLastNameProperty()
    {
        return agtLastName;
    }

    public String getAgtBusPhone()
    {
        return agtBusPhone.get();
    }

    public void setAgtBusPhone(String agtBusPhone)
    {
        this.agtBusPhone.set(agtBusPhone);
    }

    public SimpleStringProperty agtBusPhoneProperty()
    {
        return agtBusPhone;
    }

    public String getAgtEmail()
    {
        return agtEmail.get();
    }

    public void setAgtEmail(String agtEmail)
    {
        this.agtEmail.set(agtEmail);
    }

    public SimpleStringProperty agtEmailProperty()
    {
        return agtEmail;
    }

    public String getAgtPosition()
    {
        return agtPosition.get();
    }

    public void setAgtPosition(String agtPosition)
    {
        this.agtPosition.set(agtPosition);
    }

    public SimpleStringProperty agtPositionProperty()
    {
        return agtPosition;
    }

    public int getAgencyId()
    {
        return agencyId.get();
    }

    public void setAgencyId(int agencyId)
    {
        this.agencyId.set(agencyId);
    }

    public SimpleIntegerProperty agencyIdProperty()
    {
        return agencyId;
    }
}
