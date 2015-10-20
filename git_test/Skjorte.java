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
public class Skjorte {
    private String navn;
    private double pris;
    private int[] størrelse;
    private String[] farve;
    
    public Skjorte(String navn, double pris, int[] størrelse, String[] farve) {
        this.navn = navn;
        this.pris = pris;
        this.størrelse = størrelse;
        this.farve = farve;
    }
}
