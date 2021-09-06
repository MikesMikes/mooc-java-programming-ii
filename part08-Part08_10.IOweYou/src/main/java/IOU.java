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

public class IOU {
    private HashMap<String, Double> hashmap;
    
    public IOU(){
        this.hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        double owedAmount = this.hashmap.getOrDefault(toWhom, amount);
        this.hashmap.put(toWhom, owedAmount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.hashmap.getOrDefault(toWhom, 0.0);
    }
    
    
}
