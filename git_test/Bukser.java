/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_test;

/**
 *
 * @author philip
 */
public class Bukser {
    private  String name;
    private  double price;
    private  String color;
   private String size;
    
    public Bukser(String name, double price, String color, String size) {
        this.name = name;
        this.price = price;
        this.color = color; 
        this.size = size;
          
    }        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
   
}
