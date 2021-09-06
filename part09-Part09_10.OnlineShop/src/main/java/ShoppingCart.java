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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            this.cart.put(product, item);
        }

    }

    public int price() {
        int price = 0;
        for (String i : this.cart.keySet()) {
            if(!(this.cart.get(i).price() == -99)){
                price += this.cart.get(i).price();
            }
        }
        return price;
    }

    public void print() {
        for (String i : cart.keySet()) {
            System.out.println(cart.get(i));
        }
    }

}
