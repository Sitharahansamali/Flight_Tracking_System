package com.example.demo.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Flight {
    @Id
    private String Flight_No;
    private String Departure_Airport;
    private String Arrival_Airport;
    private String Departure_Time;
    private String Arrival_Time;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Flight() {
    }

    public String getFlight_No() {
        return Flight_No;
    }

    public String setFlight_No(String flight_No) {
        Flight_No = flight_No;
        return flight_No;
    }

    public String getDeparture_Airport() {
        return Departure_Airport;
    }

    public void setDeparture_Airport(String departure_Airport) {
        Departure_Airport = departure_Airport;
    }

    public String getArrival_Airport() {
        return Arrival_Airport;
    }

    public void setArrival_Airport(String arrival_Airport) {
        Arrival_Airport = arrival_Airport;
    }

    public String getDeparture_Time() {
        return Departure_Time;
    }

    public void setDeparture_Time(String departure_Time) {
        Departure_Time = departure_Time;
    }

    public String getArrival_Time() {
        return Arrival_Time;
    }

    public void setArrival_Time(String arrival_Time) {
        Arrival_Time = arrival_Time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Flight(String flight_No, String departure_Airport, String arrival_Airport, String departure_Time, String arrival_Time, Status status) {
        Flight_No = flight_No;
        Departure_Airport = departure_Airport;
        Arrival_Airport = arrival_Airport;
        Departure_Time = departure_Time;
        Arrival_Time = arrival_Time;
        this.status = status;
    }
}
