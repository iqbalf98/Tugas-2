//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//contoh baca nilai x
//jumlahkan nilai yang dibaca dengan WHILE
public class PrintXWhile{
    public static void main(String[] args){
        //kamus
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);

        //program
        Sum=0; //inisialisasi
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : "); 
        x = masukan.nextInt();/* First Elmt*/

        while (x != 999) /* Kondisi berhenti */ {
            Sum=Sum+x; //proses
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : "); 
            x = masukan.nextInt();/* First Elmt*/
        }
        System.out.println("Hasil penjumlahan = "+ Sum); //terminate
    }
}