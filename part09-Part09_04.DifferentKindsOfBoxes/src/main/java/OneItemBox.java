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
public class OneItemBox extends Box{
    private ArrayList<Item> box;
    
    public OneItemBox(){
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.box.isEmpty()){
            this.box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.box.contains(item);
    }
    
    
}
