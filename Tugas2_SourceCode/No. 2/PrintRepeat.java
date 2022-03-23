//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
public class PrintRepeat{
    public static void main(String[] args){
        // kamus
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Nilai N >0 = "); 
        /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; 
        /* First Element */
        System.out.print ("Print i dengan REPEAT: \n"); 
        do{
            System.out.print (i+"\n"); /* Proses */
            i++; /* Next Element */
        }
        while (i<=N); // kondisi pengulangan

    }

}