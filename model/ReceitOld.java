/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Customer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class ReceitOld extends Customer{
    
    public void printOrder() {
        //getters skal laves fra jTextFields som kunder fylder info ind i
        //fx: navn: navnefelt.getText() som første parameter i constructor'en
        //Customer kunde = new Customer("kundenavn ", "efternavn", "Kundegade 25 ", "Kunde@gmail.com ", 22045912, " 1234 1234 1234 1234 ", 123);
        //String order = kunde.customerDetails();
        String indkøb = "";
        String filename = "order.txt"; 
        File fil = new File(filename);
        PrintWriter pw;
        try {
        pw = new PrintWriter(fil);
       // pw.print(order);
        pw.close();
        } catch (IOException ex) {
        System.out.println("Det var ikke muligt at printe ordren: " + ex.getMessage());
       }
    }
    
}
