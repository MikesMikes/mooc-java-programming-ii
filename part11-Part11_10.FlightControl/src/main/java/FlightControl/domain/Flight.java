/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author micha
 */
public class Flight {
    private String departureID;
    private String destinationID;
    private Airplane airplane;

    public Flight(Airplane airplaneID, String departureID, String destinationID) {
        this.airplane = airplaneID;
        this.departureID = departureID;
        this.destinationID = destinationID;
    }
    
    public String toString(){
        String string = String.format("%s (%s-%s)", airplane, departureID, destinationID);
        return string;
    }
}
