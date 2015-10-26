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
public class Customer {
    private String name;
    private String address;
    private String email;
    private int phone;
    private String cardNumber;
    private int controlDigits;
    
    public Customer() {
        
    }

    public Customer(String name, String address, String email, int phone, String cardNumber, int controlDigits) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.cardNumber = cardNumber;
        this.controlDigits = controlDigits;
    }

    
    
    
    public String customerDetails() {
        return name + "\n" + address + "\n" + email
                + "\n" + phone + "\n" + cardNumber + "\n" + controlDigits;
    }
    
    
    
}
