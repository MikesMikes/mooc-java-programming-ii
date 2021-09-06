
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
public class Hideout<T> {
    private T element;
    
    public Hideout(){
        this.element = null;
    }
    
    public void putIntoHideout(T toHide){
        this.element = toHide;
    }
    
    public T takeFromHideout(){
        T clone = this.element;
        this.element = null;
        return clone;
    }
    
    public boolean isInHideout(){
        return this.element != null;
    }
}
