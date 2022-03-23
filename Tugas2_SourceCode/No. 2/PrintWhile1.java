//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

import java.util.Scanner;
//baca N
//Print i = 1 s/d N dengan while (ringkas)
public class PrintWhile1{
    public static void main(String[] args){
        //kamus
        int N;
        int i=1;
        Scanner masukan=new Scanner(System.in);
        
        //program
        System.out.print("Nilai N>0 = ");
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i<=N){
            System.out.println (i++); 
        } //(i>N)
        

    }
}