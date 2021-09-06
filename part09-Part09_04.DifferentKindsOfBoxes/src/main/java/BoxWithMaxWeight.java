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

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> box;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Item item){
        if(item.getWeight() + this.getBalance() <= this.capacity){
            this.box.add(item);
        }
    }
    
    public int getBalance(){
        if(box.isEmpty()){
            return 0;
        }
        int balance = 0;
        for(Item i : box){
            balance += i.getWeight();
        }
        return balance;
    }

    @Override
    public boolean isInBox(Item item) {
        return box.contains(item);
    }
}
