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
public class Airplane {
    private String name;
    private int capacity;
    
    public Airplane(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    
    public String getID(){
        return this.name;
    }
    
    public String toString(){
        String string = String.format("%s (%s capacity)", this.name, this.capacity);
        return string;
    }
}
