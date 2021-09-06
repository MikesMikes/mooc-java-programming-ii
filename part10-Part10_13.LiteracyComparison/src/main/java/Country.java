/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Country {
    private String name;
    private int year;
    private String sex;
    private double rate;

    public Country(String name, int year, String sex, double rate) {
        this.name = name;
        this.year = year;
        this.sex = sex;
        this.rate = rate;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getRate(){
        return this.rate;
    }
    
    
    public String toString(){
        return this.name + " (" + this.year + "), " + this.sex + ", " + this.rate;  
    }
}
