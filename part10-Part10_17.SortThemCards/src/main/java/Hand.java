
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public void print(){
        hand.stream()
                .forEach(i -> System.out.println(i));
    }

    @Override
    public int compareTo(Hand o) {
        if(this.handValue() > o.handValue()){
            return 1;
        } else if (this.handValue() < o.handValue()){
            return -1;
        }
        return 0;
    }
    
    public int handValue(){
        int sum = 0;
        for(Card i : this.hand){
            sum += i.getValue();
        }
        return sum;
    }
    
    public void sortBySuit(){
        BySuitInValueOrder sorter = new BySuitInValueOrder();
        Collections.sort(hand, sorter);
    }
}
