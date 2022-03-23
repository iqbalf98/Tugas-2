//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//membaca jari-jari, menghitung luas lingkaran
//latihan pemakaian konstanta

public class Konstant{
    public static void main(String[] args){
        //kamus
        final float PHI=3.1415f;
        float r; //jari-jari lingkaran
        Scanner masukan=new Scanner(System.in);
        //program, baca data
        System.out.print ("Jari-jari lingkaran ="); 
        r = masukan.nextFloat();
        //hitung dan tulis hasil
        System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
        System.out.print ("Akhir program \n");

    }
}