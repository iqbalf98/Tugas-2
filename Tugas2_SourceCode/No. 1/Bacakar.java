//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.*;

public class Bacakar{
    public static void main (String[] args) throws IOException{
        // kamus
        char cc;
        int bil;
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader dataln= new BufferedReader(isr);
        //atau
        BufferedReader datAln =new BufferedReader(new InputStreamReader(System.in));

        //program
        System.out.print("hello\n");

        System.out.print("baca 1 karakter : ");
        //perintah baca karakter cc
        cc=dataln.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");
        //perintah baca bil
        bil=Integer.parseInt(datAln.readLine());
        //String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        //System.out.println(kar);
        //JOptionPane.showMessageDialog(null, "hello");
        System.out.print (cc +"\n" +bil+"\n");
        System.out.print ("bye \n");

    }
}