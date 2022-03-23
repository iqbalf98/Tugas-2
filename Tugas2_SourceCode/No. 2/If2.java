//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;

//contoh pemakaian IF dua kasus komplementer
//membaca dua nilai
//menuliskan 'Nilai a positif, nilai a', jika a>0
//'nilai a negatif, nilai a', jika a<0

public class If2{
    public static void main (String[] args){
        //kamus
        int a;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a=masukan.nextInt();
        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
        } else{
            System.out.println ("Nilai a negatif "+ a);
        } 

        
    }
}