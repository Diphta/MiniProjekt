/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author philip
 */
public class Customer {
    private String name;
    private String lastname;
    private String address;
    private int postnummer;
    private String email;
    private int phone;
    private String cardNumber;
    private int controlDigits;
    private Basket basket;

    
    public Customer(String name, String lastname, String address, int postnummer, String email, int phone, String cardNumber, int controlDigits, Basket basket) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.postnummer = postnummer;
        this.email = email;
        this.phone = phone;
        this.cardNumber = cardNumber;
        this.controlDigits = controlDigits;
        this.basket = basket;
    }

    public String customerDetails() {
        return name + lastname + "\n" + address + "\n" + email
                + "\n" + phone;
    }
    
    @Override
    public String toString(){
        return name + lastname + "\n" + address + "\n" + email
                + "\n" + phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getControlDigits() {
        return controlDigits;
    }

    public void setControlDigits(int controlDigits) {
        this.controlDigits = controlDigits;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
        public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }
}
