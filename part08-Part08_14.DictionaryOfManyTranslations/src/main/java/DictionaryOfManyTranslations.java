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
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hashmap;
    
    public DictionaryOfManyTranslations(){
        this.hashmap = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.hashmap.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translations = this.hashmap.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(this.hashmap.containsKey(word)){
            return this.hashmap.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word){
        this.hashmap.remove(word);
    }
}
