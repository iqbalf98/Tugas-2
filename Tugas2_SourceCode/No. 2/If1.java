//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

//contoh pemakaian IF satu kasus
//membaca nilai integer, menuliskan nilainya jika bernilai positif

import java.util.Scanner;

public class If1{
    public static void main(String[] args){
        //kamus
        Scanner masukan=new Scanner(System.in);
        int a;
        //program

        System.out.print ("Contoh IF satu kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer : "); 
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
    }
}