//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

// pemakaian beberapa operator terhadap RELATIONAL DAN bit
public class Oper2{
    public static void main(String[] args){
        //kamus
        char i,j;

        //program
        i=3; //00000011 dalam biner
        j=4; //00000100 dalam biner

        System.out.println("i = "+ (int) i);
        System.out.println("j = "+ (int) j);
        System.out.println("i & j = "+ (i & j)); //0: 00000000 dalam biner
        System.out.println("i | j = "+ (i | j)); //7: 00000111 biner
        System.out.println("i ^ j = "+ (i ^ j)); // operator '^' tidak berfungsi sebagai pangkat di java
        System.out.println(Math.pow(i, j)); //class Math memiliki method pow(a,b) untuk pemangkatan
        System.out.println(" ~i = "+ ~i); // -4: 11111100 biner
    }
}