//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//Baca N,
//Print i=1 s/d N dengan ITERATE
public class PrintIterasi{
    public static void main(String[] args){
        //kamus
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
        N = masukan.nextInt();
        i = 1; /* First Element */
        System.out.print ("Print i dengan ITERATE : \n"); 
        for (;;){
            System.out.println(i); /* Proses */
            if (i == N){
                break;
            } //kondisi berhenti
            else {
                i++; //elemen selanjutnya
            }


        } //i==n
    }
}