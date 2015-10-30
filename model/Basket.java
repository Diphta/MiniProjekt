
package model;

import java.util.ArrayList;


public class Basket {

    private ArrayList<Product> products;
    private Customer customer;

    public Basket(Customer customer) {
        products = new ArrayList<>();
        this.customer = customer;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
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
        Receit receit = new Receit(receitContent);
        receit.printReceit();
        return receit;
    }

    public double getTotal() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getProductType().getPrice();
        }
        return sum;
    }
}

