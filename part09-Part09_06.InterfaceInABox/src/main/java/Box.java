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
public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maximumCapacity;

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(this.weight() + item.weight() <= this.maximumCapacity){
            this.items.add(item);
        }
    }
    

    @Override
    public double weight() {
        double weight = 0;
        for(Packable i : items){
            weight+= i.weight();
        }
        return weight;
    }
    
    public int numOfItems(){
        return this.items.size();
    }
    
    public String toString(){
        String string = String.format("Box: %d items, total weight %.1f kg", this.numOfItems(), this.weight());
        return string;
    }
}
