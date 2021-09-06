/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author micha
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl(Scanner scanner){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String ID, int capacity){
        this.airplanes.put(ID, new Airplane(ID, capacity));
    }
    
    public void addFlight(Airplane airplane, String departureID, String destinationID){
        Flight flight = new Flight(airplane, departureID, destinationID);
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }
    
    public Airplane getAirplane(String airplaneID){
        return this.airplanes.get(airplaneID);
    }
}
