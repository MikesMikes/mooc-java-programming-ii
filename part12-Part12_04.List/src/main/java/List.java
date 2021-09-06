/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class List<Type> {

    private Type[] values;
    public int freeIndex;

    public List() {
        this.values = (Type[]) new Object[2];
        this.freeIndex = 0;
    }

    public void add(Type value) {
        if(this.freeIndex == this.values.length){
            this.grow();
        }
        
        this.values[freeIndex] = value;
        this.freeIndex++;
    }

    private void grow() {
    int newSize = this.values.length + this.values.length  / 2;
    Type[] newValues = (Type[]) new Object[newSize];
    for (int i = 0; i < this.values.length; i++) {
        newValues[i] = this.values[i];
    }

    this.values = newValues;
    }
    
    public boolean contains(Type value){
        for(int i = 0; i < this.freeIndex; i++){
            if(this.values[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    
    public int indexOfValue(Type value){
        for(int i = 0; i < this.freeIndex;i++){
            if(this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    
    private void moveToLeft(int fromIndex){
        for(int i = fromIndex; i < this.freeIndex - 1; i++){
            this.values[i] = this.values[i + 1];
        }
    }
    
    public void remove(Type value){
        int indexOfValue = this.indexOfValue(value);
        if(indexOfValue < 0){
            return;
        }
        
        this.moveToLeft(indexOfValue);
        this.freeIndex--;
    }
    
    public Type value(int index){
        if(index < 0 || index >= this.freeIndex){
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.values[index];
    }
    
    public int size(){
        return this.freeIndex;
    }
    
    
}
