/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbs;
    
    public Abbreviations(){
        this.abbs = new HashMap<>();
    }
    
    public void addAbbreviation(String a, String b){
        this.abbs.put(a, b);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.abbs.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        return this.abbs.get(abbreviation);
    }
    
}
