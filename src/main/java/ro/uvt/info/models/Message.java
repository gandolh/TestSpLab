package ro.uvt.info.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import ro.uvt.info.services.HouseStrategy;

import java.util.Date;

public class Message {

    @JsonProperty("date")
    public Date Date;
    @JsonProperty("message")
    public String Message;

    @JsonProperty("house")
    public String House;
    public HouseStrategy HouseStrategy;
}
