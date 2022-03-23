//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//contoh pemakaian IF tiga kasus: wujud air

public class Tempair{
    public static void main(String[] args){
        // kamus
        int T;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Contoh IF tiga kasus \n"); 
        System.out.print ("Temperatur (der. C) = "); 
        T=masukan.nextInt();
        if (T < 0){
            System.out.print ("Wujud air beku \n"+ T);
        } else if ((0 <= T) && (T <= 100)){
            System.out.print ("Wujud air cair \n"+ T);
        } else if (T>100){
            System.out.print ("Wujud air uap/gas \n"+ T); 
        };

    }
}