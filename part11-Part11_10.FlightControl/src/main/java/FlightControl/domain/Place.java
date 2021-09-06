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
public class Place {
    private String place;
    
    public Place(String placeID){
        this.place = placeID;
    }
    
    public String toString(){
        return this.place;
    }
}
