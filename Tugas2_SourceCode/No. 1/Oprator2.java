//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

public class Oprator2{
    public static void main (String[] args){
        //kamus
        boolean Bool1, Bool2, TF; int i,j, hsl;
        float x,y,res;

        //program
        System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
        Bool1 = true; Bool2 = false;
        TF = Bool1 && Bool2 ; /* Boolean AND */
        TF = Bool1 || Bool2 ; /* Boolean OR */
        TF = ! Bool1 ; /* NOT */
        TF = Bool1 ^Bool2; /* XOR */
        System.out.println("Operator Logika & Bitwise :");
        System.out.println("&& = "+ (Bool1 && Bool2));
        System.out.println("|| = "+ (Bool1 || Bool2));
        System.out.println("! = "+ (! Bool1));
        System.out.println("^ = "+ (Bool1 ^ Bool2));

        //operasi numerik
        i = 5; j = 2 ;
        hsl = i+j; 
        hsl = i - j; 
        hsl = i / j; 
        hsl = i * j;
        hsl = i /j ; /* pembagian bulat */
        hsl = i%j ; /* sisa. modulo */
        System.out.println("Operasi Numerik Integer :" );
        System.out.println("+ = "+ (i+j));
        System.out.println("- = "+ (i-j));
        System.out.println("/ = "+ (i / j));
        System.out.println("* = "+ (i*j));
        System.out.println("/ bulat = "+ (i /j));
        System.out.println("% = "+ (i%j));

        //operasi numerik
        x = 5 ; y = 5 ;
        res = x + y; 
        res = x - y; 
        res = x / y; 
        res = x * y;
        System.out.println("Operasi Numerik Float :");
        System.out.println("+ = "+ (x+y));
        System.out.println("- = "+ (x-y));
        System.out.println("/ = "+ (x/y));
        System.out.println("* = "+ (x*y));

        //operasi relasional numerik
        TF = (i==j); 
        TF = (i!=j);
        TF = (i < j); 
        TF = (i > j); 
        TF = (i <= j); 
        TF = (i >= j);
        System.out.println("Operasi Relasional Numerik :");
        System.out.println("== = "+ (i==j));
        System.out.println("!= = "+ (i!=j));
        System.out.println("< = "+ (i<j));
        System.out.println("> = "+ (i>j));
        System.out.println("<= = "+ (i<=j));
        System.out.println(">= = "+ (i>=j));

        //operasi relasional numerik
        TF = (x != y);
        TF = (x < y); 
        TF = (x > y); 
        TF = (x <= y); 
        TF =(x >= y);
        System.out.println("Operasi Relasional Numerik 2 :");
    }
}