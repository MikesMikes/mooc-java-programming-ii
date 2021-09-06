
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 * @param <T>
 */
public class Pipe<T> {
    private ArrayList<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(this.isInPipe()){
            return this.pipe.remove(0);
        }
        return null;
    }
    
    public boolean isInPipe(){
        return !this.pipe.isEmpty();
    }
}
