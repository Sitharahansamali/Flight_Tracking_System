package com.example.demo.Controller;

import com.example.demo.Module.Flight;
import com.example.demo.Module.Status;
import com.example.demo.Service.FlightService;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FlightController {

    private FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
//    @GetMapping("/flights")
//    public String flight(){
//        return "ok";
//    }

//    Flight flight1 = new Flight("FL125", "Srilanka","USA","9.00","1.00", Status.CANCELLED);
//

//    @PostMapping()
//    public String changeFlight(){
//        return flight1.setFlight_No("FL250");
//    }
//    @GetMapping()
//    public Flight getFlights(){
//        return flight1;
//    }

    @RequestMapping("/flights")
    public List<Flight> GetAllFlights(){
        return flightService.GetAllFlights();
    }

    @GetMapping("/flight")
    public List<Flight> GetAllFlight(){
        return flightService.GetAllFlights();
    }

    @PostMapping("/flights")
    public void CreateNewFlight (@RequestBody Flight NewFlight){
        flightService.CreateNewFlight(NewFlight);
    }

    @DeleteMapping("/flights/{Flight_No}")
    public void DeleteFlight(@PathVariable String Flight_No){
        flightService.DeleteFlightById(Flight_No);
    }

    @PutMapping("/flights/{Flight_No}")
    public void UpdateFlight(@PathVariable String Flight_No ,@RequestBody Flight NewFlight){
        flightService.UpdateFlight(Flight_No,NewFlight);
    }





}
