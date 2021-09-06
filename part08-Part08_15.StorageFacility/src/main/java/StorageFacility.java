/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility(){
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.units.putIfAbsent(unit, new ArrayList<>());
        this.units.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(this.units.containsKey(storageUnit)){
            return this.units.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        if(this.units.containsKey(storageUnit)){
            this.units.get(storageUnit).remove(item);
            if(this.units.get(storageUnit).isEmpty()){
                this.units.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> usedUnits = new ArrayList<>();
        for(String i : this.units.keySet()){
            if(this.units.get(i).size() > 0){
                usedUnits.add(i);
            }
        }
        return usedUnits;
    }
}
