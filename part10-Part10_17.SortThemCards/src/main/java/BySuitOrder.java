
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class BySuitOrder implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        if(o1.getSuit().ordinal() < o2.getSuit().ordinal()){
            return -1;
        } else if(o1.getSuit().ordinal() < o2.getSuit().ordinal()){
            return 1;
        }
        return 0;
    }
    
}
