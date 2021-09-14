/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author micha
 */
public class Dictionary {
    private List<String> words;
    private Map<String, String> translations;
    
    public Dictionary(){
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        this.add("sana", "word");
        this.populate();
    }
    
    public String get(String word){
        return this.translations.get(word);
    }
    
    public void add(String word, String translation){
        if(!(this.translations.containsKey(word))){
            this.words.add(word);
        }
        
        this.translations.put(word, translation);
    }
    
    public String getRandomWord(){
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
    
    public void getMap(){
        this.translations.entrySet().forEach(i -> System.out.println(i));
    }
    
    public void populate(){
        for(int i = 0; i < 20 ; i++){
            String keys = "a" + i;
            String vals = "b" + i;
            this.translations.put(keys, vals);
            this.words.add(keys);
        }
    }
}
