/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Simon
 */
public class Receit {

    private String content;

    public Receit(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void printReceit() {
        String indkøb = "";
        String filename = "order.txt";
        File fil = new File(filename);
        PrintWriter pw;
        try {
            Scanner scan = new Scanner(content);
            pw = new PrintWriter(fil);
            while (scan.hasNext()) {
                pw.println(scan.nextLine());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Det var ikke muligt at printe ordren: " + ex.getMessage());

        }

    }
}
