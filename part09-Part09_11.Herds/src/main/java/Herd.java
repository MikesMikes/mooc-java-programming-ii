
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Herd implements Movable{
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for(Movable i : herd){
            i.move(dx, dy);
        }
    }
    
    public String toString(){
        String string = "";
        for(Movable i : herd){
            string += i.toString() + "\n";
        }
        return string;
    }
    
}
