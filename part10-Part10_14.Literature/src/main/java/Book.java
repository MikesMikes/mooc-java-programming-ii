/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Book {
    private String name;
    private int AgeRating;

    public Book(String name, int AgeRating) {
        this.name = name;
        this.AgeRating = AgeRating;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getRating(){
        return this.AgeRating;
    }
    
    public String toString(){
        return this.name + " (recommended for " + this.AgeRating + " years-olds or older).";
    }
}
