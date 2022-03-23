//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//contoh baca nilai x
//jumlahkan nilai yang dibaca dengan ITERATE
public class PrintXRepeat{
    public static void main(String[] args){
        //kamus
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        //program

        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999){
            System.out.print("Kasus kosong \n");
        } else{ //minimal ada satu data yang dijumlahkan
            Sum=0; //inisialisasi, invariant!!
            do{
                Sum = Sum + x; /* Proses */
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Element */
            } while (x !=999); /*kondisi Pengulangan*/{
                System.out.println ("Hasil penjumlahan = "+Sum);
            } //terminate

        }

    }
}