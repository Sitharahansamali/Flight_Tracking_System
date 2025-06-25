package com.example.demo.Controller;

import com.example.demo.Module.Flight;
import com.example.demo.Service.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlightViewController {
    public FlightViewController(FlightService flightService) {
        this.flightService = flightService;
    }

    private FlightService flightService;

    @RequestMapping("/flights")
        public String GetAllFlights(Model model ){
        model.addAttribute("allFlights" , flightService.GetAllFlights());
        return "flights";
        }


}
