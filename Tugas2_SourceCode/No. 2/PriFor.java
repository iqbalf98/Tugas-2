//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//Baca N, Print 1 s/d N dengan FOR
public class PriFor{
    public static void main (String[] args){
        //kamus
        int i,N;
        Scanner masukan=new Scanner(System.in);
        //program

        System.out.println("Baca N, print 1 s/d N "); 
        System.out.println ("N = ");
        N=masukan.nextInt();

        for (i = 1; i <= N; i++){
            System.out.println (i); };
            System.out.println ("Akhir program \n");
        }
    }
