/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author micha
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
        return allOn();
    }

    private boolean allOn() {
        boolean allIsOn = true;
        for (Sensor i : sensors) {
            System.out.println(i.isOn());
            if (!i.isOn()) {
                allIsOn = false;
            }
        }
        return allIsOn;
    }

    @Override
    public void setOn() {
        for(Sensor i : sensors){
            i.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor i : sensors){
            i.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        for(Sensor i : sensors){
            sum += i.read();
        }
        this.readings.add(sum/sensors.size());
        return sum/sensors.size();
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
