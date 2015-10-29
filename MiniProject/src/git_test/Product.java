/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_test;

import java.util.Arrays;

/**
 *
 * @author philip
 */
public abstract class Product {
    protected String name;
    protected double price;
    protected String[] color;
    protected String[] size;
    
    @Override
    public String toString() {
        return name + " " + price + "kr. " + "Farver: " + 
               Arrays.toString(color) + " Størrelser: " + Arrays.toString(size); 
    }
    
}
