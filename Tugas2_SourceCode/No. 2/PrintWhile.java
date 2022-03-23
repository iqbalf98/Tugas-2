//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
/* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile {
    public static void main(String[] args){
        //kamus
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);

        //program
        System.out.print ("Nilai N >0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; /* First Element */
        System.out.print ("Print i dengan WHILE: \n");

        while (i<=N){ // kondisi pengulangan
            System.out.println (i); /* Proses */
            i++; /* Next Element */

        };
    }
}
