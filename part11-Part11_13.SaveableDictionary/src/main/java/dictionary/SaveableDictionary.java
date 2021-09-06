/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author micha
 */
public class SaveableDictionary {

    private HashMap<String, String> toEng;
    private String file;

    public SaveableDictionary() {
        this.toEng = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.toEng = new HashMap<>();
    }

    public boolean load() {
        boolean finished = false;
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                String k = parts[0];
                String v = parts[1];
                this.add(k, v);
            }
            finished = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return finished;
    }

    public void add(String word, String translation) {
        this.toEng.putIfAbsent(word, translation);
    }

    public String translate(String word) {
        String translation = "";
        if (this.toEng.keySet().contains(word)) {
            translation = this.toEng.get(word);
        } else if (this.toEng.values().contains(word)) {
            for (String i : this.toEng.keySet()) {
                if (word.equals(toEng.get(i))) {
                    translation = i;
                }
            }
        } else {
            return null;
        }
        return translation;
    }

    public void delete(String word) {
        String key = "";
        if (this.toEng.containsKey(word)) {
            this.toEng.remove(word);
        } else if (this.toEng.values().contains(word)) {
            this.toEng.values().removeIf(value -> value.equals(word));
        }
    }

    public String toString() {
        String mapToString = this.toEng.keySet().stream()
                .map(key -> key + "=" + this.toEng.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        return mapToString;
    }

    public boolean save() {
        try{
            PrintWriter writer = new PrintWriter(this.file);
            write(writer);
            writer.close();
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public void write(PrintWriter writer) {
        for(HashMap.Entry<String, String> i : this.toEng.entrySet()){
            writer.println(i.getKey() + ":" + i.getValue());
        }
    }
}
