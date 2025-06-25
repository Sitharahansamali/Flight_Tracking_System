package com.example.demo.Service;

import com.example.demo.Module.Flight;
import com.example.demo.Module.Status;
import com.example.demo.Repository.FlightRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    private FlightRepository flightRepository;

    public List<Flight> GetAllFlights(){
        return flightRepository.findAll();
    }

    public void CreateNewFlight (Flight Newflight){
        flightRepository.save(Newflight);
    }

    public void DeleteFlightById(String Flight_No ){
        flightRepository.deleteById(Flight_No);
    }

    public void UpdateFlight(String Flight_No , Flight NewFlight){
        NewFlight.setFlight_No(Flight_No);
        flightRepository.save(NewFlight);
    }

@PostConstruct
    public void loadData(){
    Flight flight1 = new Flight("FL400","SriLanka","USA","9.00","12.00", Status.LANDED);
    Flight flight2 = new Flight("FL420","SriLanka","India","9.00","12.00", Status.LANDED);

    flightRepository.save(flight1);
    flightRepository.save(flight2);


}



}
