/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skinnerdatamanageroop5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kassai Ferenc
 */
public class Array {

    private String nextLine = "";
    private PrintWriter pw;
    private BufferedReader br;

    public Array() {
    }

    public Array(PrintWriter pw, BufferedReader br) {
        this.pw = pw;
        this.br = br;

    }

    public String getNextLine() {
        return nextLine;
    }

    public void setNextline(String nextLine) {
        this.nextLine = nextLine;
    }

    public Array readWriteData(String nextLine, String nextArrayName) throws IOException {
        Array array = new Array(pw, br);
        String text = "";

        if (!nextArrayName.equals("B:")) {
            while (!nextLine.equals(nextArrayName)) {
                String textIn = nextLine;
                textIn = textIn.substring((textIn.indexOf(":") + 1)).trim();
                text = text + " " + textIn;

                nextLine = array.br.readLine();

            }
        } else {
            while (nextLine.startsWith(" ")) {
                String textIn = nextLine;
                textIn = textIn.substring((textIn.indexOf(":") + 1)).trim();
                text = text + " " + textIn;

                nextLine = array.br.readLine();
                if (nextLine == null) {
                    break;
                }
            }

        }

        String[] brow = text.split(" ");
        for (int i = 1; i < brow.length; i++) {
            if (!brow[i].equals("")) {
                pw.print(brow[i] + ";");
            }
        }
        if (nextArrayName.equals("B:")) {
            pw.println("");
        }
        array.setNextline(nextLine);
        return array;
    }

    public Array readWriteLatency(String nextLine, String nextArrayName) throws IOException {
        Array array = new Array(pw, br);
        String text = "";
        while (!nextLine.equals(nextArrayName)) {
            String textIn = nextLine;
            textIn = textIn.substring((textIn.indexOf(":") + 1)).trim();
            text = text + " " + textIn;

            nextLine = array.getBr().readLine();
            if (nextLine == null) {
                nextLine = nextArrayName;
            }

        }
        String[] data = text.split(" ");
        double sum = 0;

        int numberOfData = 1;
        for (int i = 0; i < data.length; i++) {
            if (!data[i].equals("")) {
                sum = sum + Double.parseDouble(data[i]);
                numberOfData++;
            }
        }
        if (numberOfData > 1) {
            pw.print((sum / (numberOfData - 1)) + ";");
        }else{
            pw.print("No Data;");
        }
        array.setNextline(nextLine);
        return array;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

}
