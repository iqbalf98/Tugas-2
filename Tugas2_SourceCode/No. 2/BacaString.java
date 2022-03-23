//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {
    public static void main(String[] args) throws IOException{
        //kamus
        String str; 
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        //program
        System.out.print ("\nBaca string dan Integer: \n"); 
        System.out.print("masukkan sebuah string: "); 
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);

    }
}
