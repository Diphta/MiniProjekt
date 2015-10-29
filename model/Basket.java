/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class Basket {

    private ArrayList<Product> products;
    private Customer customer;

    public Basket(Customer customer) {
        products = new ArrayList<>();
        this.customer = customer;

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Receit generateReceit() {
        String receitContent = "";
        receitContent += customer + "\n";
        receitContent += "-------------\n";
        for (Product product : products) {
            receitContent += product + "\n";
        }
        receitContent += "==============\n";
        receitContent += getTotal();

        return new Receit(receitContent);
    }

    public double getTotal() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getProductType().getPrice();
        }
        return sum;
    }
}

