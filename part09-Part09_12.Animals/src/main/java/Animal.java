/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        String string = String.format("%s eats", this.name);
        System.out.println(string);
    }

    public void sleep() {
        String string = String.format("%s sleeps", this.name);
        System.out.println(string);
    }

    public String getName() {
        return this.name;
    }
}
