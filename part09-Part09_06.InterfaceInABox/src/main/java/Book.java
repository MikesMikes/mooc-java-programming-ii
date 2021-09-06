/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Book implements Packable{
    private String author;
    private String bookName;
    private double weight;

    public Book(String author, String bookName, double weight) {
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
    }
    
    public String toString(){
        String string = String.format("%s: %s", this.author, this.bookName);
        return string;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
}
