/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse() {
        productPrice = new HashMap<>();
        productStock = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);

    }

    public int price(String product) {
        if (!(productPrice.containsKey(product))) {
            return -99;
        }
        return productPrice.get(product);
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (productStock.containsKey(product)) {
            if (productStock.get(product) > 0) {
                productStock.put(product, productStock.get(product) - 1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<>();
        for(String i : this.productPrice.keySet()){
            products.add(i);
        }
        return products;
    }
}
