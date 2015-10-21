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
public class TShirt {
    private String name;
    private double price;
    private String[] size;
    private String[] color;
    
    public TShirt(String name, double price, String[] size, String[] color) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
    }
}
