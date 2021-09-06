/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(this.registry.containsKey(licensePlate))) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!(this.registry.get(licensePlate) == null)) {
            return this.registry.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if(this.registry.containsKey(licensePlate)){
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate i : this.registry.keySet()) {
            System.out.println(i.getNumber());
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (LicensePlate i : this.registry.keySet()) {
            if(!owners.contains(this.registry.get(i))){
                System.out.println(this.registry.get(i));
                owners.add(this.registry.get(i));
            }
        }
    }

}
