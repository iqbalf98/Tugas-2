//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//contoh baca nilai x
//jumlahkan nilai yang dibaca dengan ITERATE
public class PrintXInterasi{
    public static void main (String[] args){
        //kamus
        int Sum=0;
        int x;
        Scanner masukan=new Scanner(System.in);
        //program
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Element */
        if (x == 999){
            System.out.print ("Kasus kosong \n");

        }else { //minimal ada 1 data yang dijumlahkan
            Sum=x; //inisialiasi; invariant !!
            for(;;){
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if(x==999){
                    break;
                } else{
                    Sum=Sum+x;
                }
            }

        } System.out.println("Hasil penjumlahan = "+ Sum);

    }
}