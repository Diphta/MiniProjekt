
package model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Receit {

    private String content;
    private int ones;
    private int tens;
    private int hundreds;
    private int thousands;
    private int tenThousands;
    
    
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
 ones++;
       if (ones == 10) {
           tens++;
           ones = 0;
       }
       if (tens == 10) {
       hundreds++;
       tens = 0;
       }
       if (hundreds == 10){
       thousands++;
       hundreds = 0;
       }
       if (thousands == 10){
           tenThousands ++;
           thousands = 0;
       }
       String str1 = Integer.toString(ones);
       String str2 = Integer.toString(tens);
       String str3 = Integer.toString(hundreds);
       String str4 = Integer.toString(thousands);
       String str5 = Integer.toString(tenThousands);

        String indkøb = ""; 
        String filename = "Ordernummer " +str5+str4+str3+str2+str1;
        content = "Ordernummer: " +str5+str4+str3+str2+str1 +"\n"+ content;
        
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
